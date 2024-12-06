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
  docker-compose -f $DOCKER_COMPOSE_FILE pull || error "Error when obtaining images."
  docker-compose -f $DOCKER_COMPOSE_FILE --profile production up -d --build || error "Error when lifting the containers."
  log "Container successfully lifted."
}

down() {
  log "Stopping and deleting containers..."
  docker-compose -f $DOCKER_COMPOSE_FILE down --remove-orphans || error "Error when stopping containers."
  log "Contenedores successfully stopped."
}

clean() {
  log "Removing old containers, images and volumes..."
  docker system prune -f || error "Error during cleaning."
  log "Cleaning completed."
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
  *)
    echo "Use: $0 {up|down|restart|clean}"
    exit 1
    ;;
esac

exit 0
