FROM maven:3.6.0-jdk-8-alpine AS BUILD_IMAGE
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:8-jre-alpine 
COPY --from=BUILD_IMAGE /home/app/target/kubernetes-0.1.jar .
EXPOSE 8080
CMD ["java","-jar","kubernetes-0.1.jar"]
