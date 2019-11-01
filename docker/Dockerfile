FROM openjdk:11
ARG BUILD_VERSION
ARG APP_NAME
VOLUME /tmp
COPY target/${APP_NAME}-${BUILD_VERSION}.jar /usr/jar/myapp/app.jar
WORKDIR /usr/jar/myapp
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080
