FROM openjdk:17-alpine
WORKDIR /offer
COPY target/*.jar /offer/offer.jar
ENTRYPOINT ["java","-jar","/offer/offer.jar"]
EXPOSE 8002