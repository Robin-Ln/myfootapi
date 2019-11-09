FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE
ENV PROFILE="dev"
COPY target/${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${ENV_PROFILE}","/app.jar"]
EXPOSE 8080
