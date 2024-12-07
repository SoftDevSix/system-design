#!/bin/bash

DOCKER_COMPOSE_FILE="docker-compose-prod.yml"

log() {
  echo -e "\033[1;32m$1\033[0m"
}

error() {
  echo -e "\033[1;31mError: $1\033[0m"
  exit 1
}

if ! command -v docker &> /dev/null; then
  error "Docker is not installed. Please install it first."
fi

if ! command -v docker-compose &> /dev/null; then
  error "Docker Compose is not installed. Please install it first."
fi

up() {
  log "Lifting containers with $DOCKER_COMPOSE_FILE..."
  docker compose -f $DOCKER_COMPOSE_FILE pull || error "Error when obtaining images."
  docker compose -f $DOCKER_COMPOSE_FILE --profile production up -d --build || error "Error when lifting the containers."
  log "Containers successfully lifted."
}

down() {
  log "Stopping and deleting containers..."
  docker compose -f $DOCKER_COMPOSE_FILE down --remove-orphans || error "Error when stopping containers."

  orphan_containers=$(docker ps -q --filter "network=system-design_default")
  if [ ! -z "$orphan_containers" ]; then
    docker stop $orphan_containers || error "Error stopping orphan containers."
    docker rm $orphan_containers || error "Error removing orphan containers."
  fi

  log "Deleting unused networks..."
  docker network prune -f || error "Error pruning networks."

  log "Containers and networks successfully stopped."
}

clean() {
  log "Removing all running containers..."
  docker rm -f $(docker ps -q) || error "Error removing running containers."
  log "Cleaning completed."
}

update_container() {
  local container_name=$1
  if [ -z "$container_name" ]; then
    error "You must provide the name of the container to update."
  fi

  log "Updating container: $container_name..."

  image_name=$(grep -A 1 "$container_name:" "$DOCKER_COMPOSE_FILE" | grep "image:" | awk '{print $2}')

  if [ -z "$image_name" ]; then
    error "No image found for container $container_name in $DOCKER_COMPOSE_FILE."
  fi

  log "Pulling the latest image: $image_name..."
  docker pull $image_name || error "Error pulling the image for $container_name."

  log "Recreating the container $container_name..."
  docker compose -f $DOCKER_COMPOSE_FILE up -d --no-deps --build $container_name || error "Error recreating the container $container_name."

  log "Container $container_name updated successfully."
}


info() {
  log "Fetching system information..."
  docker ps --format "table {{.Names}}\t{{.Image}}\t{{.Status}}" || error "Error retrieving container information."
}

case "$1" in
  up)
    up
    ;;
  down)
    down
    ;;
  restart)
    down
    up
    ;;
  clean)
    clean
    ;;
  update)
    update_container "$2"
    ;;
  info)
    info
    ;;
  *)
    echo "Usage: $0 {up|down|restart|clean|update <container_name>|info}"
    exit 1
    ;;
esac

exit 0
