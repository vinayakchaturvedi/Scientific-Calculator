FROM openjdk:8
MAINTAINER Vinayak Chaturvedi vinayak.chatuvedi96@gmail.com
COPY ./target/ScientificCalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "ScientificCalculator-1.0-SNAPSHOT.jar", "ScientificCalculator"]