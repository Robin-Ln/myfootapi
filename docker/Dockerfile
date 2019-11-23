FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE
ENV PROFILE=dev
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${ENV_PROFILE}","/app.jar"]
