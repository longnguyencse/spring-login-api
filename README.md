# Install plugin Swagger 2
> https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api

> https://springframework.guru/spring-boot-restful-api-documentation-with-swagger-2/

> http://localhost:5000/v2/api-docs

> http://localhost:5000/swagger-ui.html

## Tutorial
1. Database is generate automation but you must creating default roles </br>
We’ll have a fixed set of predefined roles in our application. Whenever a user logs in, we’ll assign ROLE_USER to it by default.
</br>
For assigning the roles, they have to be present in the database. So let’s create the two default roles in the database by executing the following insert statements -
</br>
> INSERT INTO roles(name) VALUES('ROLE_USER');
> INSERT INTO roles(name) VALUES('ROLE_ADMIN');

Reference: 
> https://www.callicoder.com/spring-boot-spring-security-jwt-mysql-react-app-part-1/

## Demo

> POST  http://localhost:5000/api/auth/signup -d 
{ "name":"nqlong","username":"Long3","email": "nqlong3@gmail.com", "password":"123456"}
</br>

> POST http://localhost:5000/api/auth/signin

{"usernameOrEmail": "nqlong3@gmail.com","password":"123456"}

 telnet 35.247.142.226 8080
 
 https://linuxize.com/post/how-to-setup-a-firewall-with-ufw-on-ubuntu-18-04/
 
 netstat -an | grep "LISTEN "
 wget localhost:5000
 sudo ufw status

 # Running your Application
 ## Using the Maven Plugin
 > mvn spring-boot:run
 ## Using the Gradle Plugin
 > gradle bootRun
 
 
## Calling protected APIs
Once you've obtained the access token using the login API, you can call any 
protected API by passing the accessToken in the Authorization header of the request like so-
 
 > Authorization: Bearer <accessToken>
 
 The JwtAuthenticationFilter will be read accessToken from the header, verify it, and allow/deny access to the API.
 
 </br>
 if you use token for indentify a user
 
 > https://www.callicoder.com/spring-boot-spring-security-jwt-mysql-react-app-part-3/
 
 > SecurityContextHolder.getContext().getAuthentication();
 
 ![alt text](https://github.com/longnguyencse/spring-login-api/blob/master/data/image/parse-token.png "JWT")
 
 </br>
 Reference: https://www.toptal.com/java/rest-security-with-jwt-spring-security-and-java

## Custom query with @Query annotation.
I've used custom queries because:
- Many of the queries cannot be constructed by Spring-Data-Jpa's dynamic query methods (
https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.details)
</br>
- Even if they can be constructed, they don't generate an optimized query

> https://docs.oracle.com/cd/E12839_01/apirefs.1111/e13946/ejb3_langref.html#ejb3_langref_constructor

# Multi profile <Support multiple profiles with Spring boot
1. Create 3 file name : 
> application-dev.properties 
> application-test.properties 
> application-prod.properties
 
2. config profile use 
> spring.profiles.active=dev

# i18n
> https://medium.com/skillhive/internalization-in-spring-boot-22f4fa82f132
> https://www.javadevjournal.com/spring-boot/spring-boot-internationalization/

# RabitMQ
> https://spring.io/guides/gs/messaging-rabbitmq/

# Add Lombok
1. Add to pom.xml
2. Install plugin Lombok

# Encode vietnamese
1. Plugin Eclipse : AnyEdit Tool plugin
> https://marketplace.eclipse.org/content/anyedit-tools

# Utils date (importment)