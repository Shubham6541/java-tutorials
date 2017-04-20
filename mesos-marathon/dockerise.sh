#!/usr/bin/env bash
set -e
docker login -u mogronalol -p $DOCKER_PASSWORD
docker build -t nklkarthi/mesos-marathon-demo:$BUILD_NUMBER .
docker push nklkarthi/mesos-marathon-demo:$BUILD_NUMBER
