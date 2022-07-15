# dematic

Prerequisite (Software needed):
- Apache Maven 3.8.6
- Java 1.8 or later
- Postman

To run the project:
1. Clone hte repo
2. Open CMD and change to the directory "../calculator"
3. Excute command "mvn clean package"
4. Excute command "mvn spring-boot:run"

Trigger API using Postman:
1. URL: localhost:8080/api/calculator
2. HTTP: POST
3. Body: {"operationId": "Divide",
    "firstVal": 9,
    "secondVal": 3}
