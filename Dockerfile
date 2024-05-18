FROM openjdk:17-jdk-slim
COPY "./target/eldarchallengeDM-0.0.1-SNAPSHOT.jar" eldarchallengeDM-0.0.1-SNAPSHOT.jar"
EXPOSE 8080
ENTRYPOINT ["java","-jar","eldarchallengeDM-0.0.1-SNAPSHOT.jar"]

