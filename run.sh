#!/bin/bash

docker rm -f demoapp
docker run -d -p 8080:8080 --name demoapp demoapp
