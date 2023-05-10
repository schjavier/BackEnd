FROM amazoncorretto:11-alpine-jdk
MAINTAINER Javier Schettini 

COPY target/portfolio-0.0.1-SNAPSHOT.jar backend-app.jar
ENTRYPOINT ["java", "-jar", "/backend-app.jar"]