FROM openjdk:23
ARG JAR_FILE=target/payment-service-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} paymentservice.jar
ENTRYPOINT ["java","-jar","/paymentservice.jar"]