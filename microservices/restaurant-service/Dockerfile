FROM openjdk:17-jdk-slim

EXPOSE 8080

ADD ./build/libs/*.jar app.jar

# Install curl
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

ENTRYPOINT ["java","-jar","/app.jar"]
