FROM openjdk:8-jre-alpine
COPY ./target/credit-card-app-1.0.0-SNAPSHOT.jar /usr/src/tmp/
WORKDIR /usr/src/tmp
EXPOSE 8080
CMD ["java", "-jar", "credit-card-app-1.0.0-SNAPSHOT.jar"]
