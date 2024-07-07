# Use an OpenJDK image to run the JAR
FROM openjdk:11-jre-slim

# Copy the JAR file into the Docker image
COPY my-app.jar /app/my-app.jar

# Set the working directory
WORKDIR /app

# Command to run the JAR
ENTRYPOINT ["java", "-jar", "my-app.jar"]
