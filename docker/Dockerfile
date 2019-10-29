FROM openjdk:11
VOLUME /tmp
COPY target/app.jar /usr/jar/myapp/app.jar
WORKDIR /usr/jar/myapp
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080
