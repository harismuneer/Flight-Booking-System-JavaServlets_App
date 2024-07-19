FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/TurkishAirlines-1.0-SNAPSHOT.jar /app/TurkishAirlines.jar


EXPOSE 8080

ENTRYPOINT ["java", "-jar", "TurkishAirlines.jar"]
