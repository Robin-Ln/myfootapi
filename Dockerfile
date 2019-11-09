FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE="app"
ARG PROFILE="dev"
COPY target/${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${PROFILE}","/app.jar"]
EXPOSE 8080
