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
