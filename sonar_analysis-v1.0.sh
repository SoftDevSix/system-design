#! /nix/var/nix/profiles/default/bin/nix-shell
#! nix-shell -i bash -p jdk17

export SONAR_PROJECT_KEY=multi-project
export SONAR_HOST_URL=http://sonarqube-argos.ukwest.cloudapp.azure.com/
export SONAR_TOKEN=sqp_b870293def3b83bbfe75254c418952d134eca011
#export REVISION_PATCH=$(git log -1 --format='%h')

./gradlew test codeCoverageReport sonar
