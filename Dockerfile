FROM maven:3.8.6-openjdk-18-slim
WORKDIR /UserService
COPY . .
RUN mvn  install
CMD mvn spring-boot:run

#FROM openjdk:11-jre-slim
#WORKDIR /app
#COPY . .
#COPY /target/user_service-0.0.1-SNAPSHOT.jar user-service.jar
#EXPOSE 8080
#CMD [ "java", "-jar", "user-service.jar"]






