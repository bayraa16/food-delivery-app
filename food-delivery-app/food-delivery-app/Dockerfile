FROM openjdk:21
WORKDIR /app
COPY target/food-delivery-app-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
