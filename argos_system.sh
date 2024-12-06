#!/bin/bash

# Argos System Management Script
# Usage: ./argos_system.sh [start|update|restart|delete|info] [container_name] [new_version]

# Check if Docker is installed
if ! command -v docker &> /dev/null
then
    echo "Docker is not installed. Please install Docker to use this script."
    exit 1
fi

# Repositories of dockerized projects
repos=(
  "ArgosUI"
  "ArgosFileManager"
  "ArgosApplication"
)

# Clone or pull the latest changes for each repository
sync_repos() {
  for repo in "${repos[@]}"
  do
    if [ -d "$repo" ]; then
      echo "Pulling latest changes for $repo..."
      git -C "$repo" pull
    else
      echo "Cloning repository $repo..."
      git clone "https://github.com/SoftDevSix/$repo.git"
    fi
  done
}

# start all services
start_services() {
  echo "Starting all services..."
  for repo in "${repos[@]}"
  do
    echo "Starting $repo..."
    docker-compose -f "$repo/docker-compose-prod.yml" --profile production up -d
  done
}

# update a specific container
update_container() {
  container_name=$1
  new_version=$2

  if [ -z "$container_name" ] || [ -z "$new_version" ]; then
    echo "Usage: ./argos_system.sh update <container_name> <new_version>"
    exit 1
  fi

  echo "Updating $container_name to version $new_version..."
  docker pull "$container_name:$new_version"
  docker stop "$container_name"
  docker rm "$container_name"
  docker run -d --name "$container_name" "$container_name:$new_version"
}

# restart all services
restart_services() {
  echo "Restarting all services..."
  for repo in "${repos[@]}"
  do
    echo "Restarting $repo..."
    docker-compose -f "$repo/docker-compose-prod.yml" down
    docker-compose -f "$repo/docker-compose-prod.yml" --profile production up -d
  done
}

# delete all services
delete_services() {
  echo "Deleting all services..."
  for repo in "${repos[@]}"
  do
    echo "Deleting $repo..."
    docker-compose -f "$repo/docker-compose-prod.yml" down
  done
}

# Function to print system information
print_info() {
  echo "Fetching system information..."
  echo "Running containers:"
  docker ps --format "table {{.Names}}\t{{.Image}}\t{{.Status}}"
}

# Main script logic
case "$1" in
  start)
    sync_repos
    start_services
    ;;
  update)
    update_container "$2" "$3"
    ;;
  restart)
    restart_services
    ;;
  delete)
    delete_services
    ;;
  info)
    print_info
    ;;
  *)
    echo "Usage: $0 {start|update|restart|delete|info} [container_name] [new_version]"
    exit 1
    ;;
esac
