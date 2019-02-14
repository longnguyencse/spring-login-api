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