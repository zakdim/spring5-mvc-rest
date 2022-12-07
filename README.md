[//]: # ([![CircleCI]&#40;https://dl.circleci.com/status-badge/img/gh/zakdim/spring5-mvc-rest/tree/master.svg?style=svg&#41;]&#40;https://dl.circleci.com/status-badge/redirect/gh/zakdim/spring5-mvc-rest/tree/master&#41;)

# RESTFul WebService with Spring MVC

An example application for `Section 24: RESTFul WebService with Spring MVC` of the Udemy course:
[Spring Framework 5 - Beginner to Guru](https://www.udemy.com/course/spring-framework-5-beginner-to-guru/)

## Section 24: RESTFul WebService with Spring MVC

### Lecture 374: New Spring Boot Project

* [Fruit Shop API Example](https://api.predic8.de/shop/docs)

### Lecture 381: Testing with Postman

* Access H2 console: http://localhost:8080/h2-console

* Examples of API URLs to test in Postman:

```
http://localhost:8080/api/v1/categories/
http://localhost:8080/api/v1/categories/Fresh
```

### Lecture 383: Assignment Review

* Generate Java POJOs from JSON : [jsonschema2pojo](https://www.jsonschema2pojo.org/)

## Section 25: Using Swagger with Spring Boot

### Lecture 395: Introduction to Swagger

[Swagger API Development](https://swagger.io/)

### Lecture 397: Configuring Swagger

* Swagger 2

1. pom.xml :

```xml
    <properties>
        <!-- ... -->
        <springfox-swagger.version>3.0.0</springfox-swagger.version>
    </properties>
    <!-- ... -->
       <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>${springfox-swagger.version}</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>${springfox-swagger.version}</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-boot-starter</artifactId>
            <version>${springfox-swagger.version}</version>
        </dependency>
```

2. application.properties :

```properties
spring.mvc.pathmatch.matching-strategy=ant_path_matcher
springfox.documentation.swagger.v2.enabled=true

```

3. Access data :

JSON: http://localhost:8080/v2/api-docs

Swagger UI: http://localhost:8080/swagger-ui/index.html

### Lecture 403: Introduction to Swagger Editor

[Swagger Editor](https://swagger.io/tools/swagger-editor/)

## Section 27: Spring MVC Content Negotiation

### Lecture 428: Introduction to XML Schema

[XSD/XML Schema Generator](https://freeformatter.com/xsd-generator.html)

### Lecture 430: Using JAXB to Generate Java Classes

[JAXB > Basic Examples - Java Generation](https://www.mojohaus.org/jaxb2-maven-plugin/Documentation/v2.4/example_xjc_basic.html)

