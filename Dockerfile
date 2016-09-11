FROM java:8-jdk
VOLUME /tmp
ADD target/learner-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/studentprofile", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
