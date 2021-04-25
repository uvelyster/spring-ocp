#!/bin/bash

docker rm -f demodb

docker run -d --name demodb \
-p 30306:3306 \
-e MYSQL_USER=testuser \
-e MYSQL_ROOT_PASSWORD=pass \
-e MYSQL_DATABASE=testdb \
-e MYSQL_PASSWORD=testpass \
-v ~/spring-ocp/sql/:/docker-entrypoint-initdb.d/ \
mysql:5.7
