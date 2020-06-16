FROM openjdk:8-jre
COPY target/hibernate-mapping.jar hibernate-mapping.jar
ENTRYPOINT ["java", "-jar", "hibernate-mapping.jar"]