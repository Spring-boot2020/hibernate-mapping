FROM openjdk:8-jre
COPY hibernate-mapping.jar hibernate-mapping.jar
ENTRYPOINT ["java", "-jar", "hibernate-mapping.jar"]