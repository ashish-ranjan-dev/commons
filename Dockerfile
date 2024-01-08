FROM openjdk:17
EXPOSE 8088
ADD ./build/libs/commons-0.0.1-SNAPSHOT.jar commons-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","commons-0.0.1-SNAPSHOT.jar"]