# Credit Card Provider POC

A spring boot application which exposes 2 RestEndpoints- Add new cards and list all cards from a system.

  - Spring Boot 2.0.3.Release
  - H2 Database Runtime (Memory)
  - Spring Boot JDBC
  - SpringFox Swagger
  - SpringFox UI
  - Junits
  - SureFire Reports
  - Docker com.spotify v1.3.6 Plugin
  - Maven 4.0

### Installation

This application is built using maven and all dependencies will be added automatically.

```sh
$ cd credit-card-app
$ mvn clean
$ mvn clean spring-boot:run
```

For Running Tests and Generating the Test Report:

```sh
$ mvn test
$ mvn surefire-report:report-only
$ mvn site -DgenerateReports=false
```
### Docker
To Create A Docker Image Using Maven
```sh
$ mvn clean package docker:build
```
This application is available over Docker Hub io
```sh
docker pull TestUsernathData/creditcardprocessor:latest
```
**Docker Run**
```sh
docker run -p '<require-port>':8080 TestUsernathData/creditcardprocessor:latest
```

### SpringFox Swagger

Swagger UI will be available on the following link:

```sh
localhost:8080/ccp/v1/swagger-ui.html
localhost:8080/ccp/v1/v2/api-docs
```
### RestAPI Details
![alt text](https://raw.githubusercontent.com/TestUserData/credit-card-processor/master/swagger.png)


### Test Cases
![alt text](https://raw.githubusercontent.com/TestUserData/credit-card-processor/master/testcase.png)
