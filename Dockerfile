#Start with a base image containing Java runtime
FROM openjdk:11-slim as build

#Information around who maintains the image
MAINTAINER Rajnesh Thakur

# Add the application's jar to the container
COPY target/docker-sample-app-0.0.1-SNAPSHOT.jar docker-sample-app-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/docker-sample-app-0.0.1-SNAPSHOT.jar"]