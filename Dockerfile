FROM openjdk:12-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENV DB_URL postgres
ENV DB_USERNAME postgres
ENV DB_PASSWORD postgres
ENTRYPOINT ["java","-jar","/app.jar"]