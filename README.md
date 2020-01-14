# Sleuth Demo
This is demo application for sleuth using spring boot, Spring Cloud Feign,Spring Cloud Sleuth, 
# How to run
1. run ./gradlew clean bootrun in three application
2. run `curl --location --request GET 'localhost:8080/v1/hello'` to invoke enterpoint.
chain will be 'spring-server-enterpoint' -> 'spring-server-consumer-one' -> 'spring-server-consumer-two'
