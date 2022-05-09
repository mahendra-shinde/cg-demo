#FROM maven:3-jdk-8-slim as build
#WORKDIR /app
#COPY . .
#RUN ["mvn","-DskipTests","package"]

FROM openjdk:8-jre-slim-buster
#COPY --from=build /app/target/student-service-1.0.jar /app/student-service.jar
COPY target/student-service-1.0.jar /app/student-service.jar
CMD ["java","-jar","/app/student-service.jar"]