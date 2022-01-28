FROM openjdk:11
ARG JAR_FILE=build/libs/TourGuideuser-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} TourGuideuser-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/TourGuideuser-0.0.1-SNAPSHOT.jar"]
EXPOSE 9009