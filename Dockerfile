# TicTac Project Dockerfile
# Version: 1.0.0

# Image builds from the official Docker Java Image

FROM java:8

MAINTAINER Nicholas Grippin <ngrippin9@gmail.com>

WORKDIR /

USER daemon

ENTRYPOINT ["java", "-jar", "/opt/tictac-assembly-1.0.jar"]

EXPOSE 8089

COPY target/scala-2.11/tictac-assembly-1.0.jar /opt/tictac-assembly-1.0.jar
