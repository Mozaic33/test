#!/bin/bash

docker build -t amgrads .

docker rm -f $(docker ps -aq --filter name=amgrads2018) 2>/dev/null

docker run --name amgrads2018 -d -it -p 8888:8080 --rm amgrads
