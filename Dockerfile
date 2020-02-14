FROM openjdk:8-jdk-alpine as builder
## set workdir
WORKDIR /usr/src/app
## copy application
COPY . .
## build app
RUN ./gradlew bootJar -x test

FROM openjdk:8-jdk-alpine
## expose port
EXPOSE 8080
## copy jar
COPY --from=builder /usr/src/app/build/libs/awpwo.jar /usr/local/awpwo.jar
## run app
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/local/awpwo.jar"]
