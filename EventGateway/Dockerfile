FROM openjdk:8
ADD target/event-gateway-docker.jar event-gateway-docker.jar 
EXPOSE 8005
ENTRYPOINT ["java" ,"-jar" , "event-gateway-docker.jar" ]