#!/bin/bash
jar -cvf age.war *
scp -i wilsonj_cloud.pem age.war ubuntu@141.195.7.187:/home/ubuntu
