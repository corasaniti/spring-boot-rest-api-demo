# Sample REST CRUD API with Spring Boot Api Demo whith Mysql, JPA and Hibernate 

## Steps to Setup

**1. Clone the application**

```bash
https://github.com/corasaniti/spring-boot-rest-api-tutorial.git
```

**2. Create Mysql database**
```bash
create database spring_rest_demo
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

Build With Maven command
```bash
mvn package
```

Alternatively you can use batch file to clean and build application

+ set `M2_HOME` and `JAVA_HOME` in  `build.properties`
+ execute  `clean.bat`
+ execute  `build.bat`

Launch Application with
```bash
java -jar target/spring-boot-rest-demo-0.0.1-SNAPSHOT.jar
```


**5. Run Without Build**

You can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/v1/users
    
    POST /api/v1/users
    
    GET /api/v1/users/{userId}
    
    PUT /api/v1/users/{userId}
    
    DELETE /api/v1/users/{userId}

