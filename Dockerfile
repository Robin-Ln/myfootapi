FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE="app"
ARG PROFILE="dev"
ENV ENV_PROFILE=$PROFILE
COPY target/${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${ENV_PROFILE}","/app.jar"]
EXPOSE 8080
