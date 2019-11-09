FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE
COPY target/${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
