FROM openjdk:15-slim
COPY ./target/resourceserver-1.0.jar ./
EXPOSE 9090
ENTRYPOINT ["java" , "-jar" , "resourceserver-1.0.jar"]