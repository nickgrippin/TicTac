# TicTac Project Dockerfile
# Version: 1.0.0

# Image builds from the official Docker Java Image

FROM java:8

MAINTAINER Nicholas Grippin <ngrippin9@gmail.com>

WORKDIR /

USER daemon

ENTRYPOINT ["java", "-jar", "/opt/TicTac.jar"]

EXPOSE 8080

COPY target/scala-2.11/TicTac.jar /opt/TicTac.jar