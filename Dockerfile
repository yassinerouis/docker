FROM openjdk:8
ADD target/docker_yassine-0.0.1-SNAPSHOT.jar /docker_yassine-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","docker_yassine-0.0.1-SNAPSHOT.jar"]
EXPOSE 8086