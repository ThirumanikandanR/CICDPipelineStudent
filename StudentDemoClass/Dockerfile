FROM adoptopenjdk/openjdk14:alpine-slim
COPY target/StudentDemoClass-0.0.1-SNAPSHOT.jar StudentDemoClass-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "StudentDemoClass-0.0.1-SNAPSHOT.jar"]
