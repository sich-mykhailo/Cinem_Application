 # Cinema Application
 
 ## Description
I created this project to demonstrate my knowledge in technologies such as Hibernate, Spring (Core, MVC and Security), Java Core, JSON, OOP and Solid principles. 
 * "Cinema Application" is based on a three-tier architecture that includes Dao, Service and Controller levels.
 * You can register a new user, or use existing ones.
 * The program has two roles for access: "ADMIN" and "USER". For example, 
 you can login as a user and you will have access to view the list of movies, but not for editing.
 Only "ADMIN" can change the list of movies in the database.
 * All CRUD operations were created to work with the databas.
 
## Technologies
- Spring (Core, MVC and Security)
- Hibernate
- JSON
- Java 11
- MySQL
- Maven
- TomCat

## How to install

 1. #### Install MySQL
 2. #### Install Tomcat 9.0.54
 3. #### Change properties for the folliwing line in db.properties file:
 
 - db.driver=DRIVER
 - db.url=URL TO DATABASE
 - db.user=USERNAME
 - db.password=PASSWORD

4. #### Run Tomcat with IDEA

5. #### If you want to login as ADMIN : 
 - "login: admin@gmail.com, password: 12345678";
   #### If you want to login as "USER":
 - "login: user@gmail.com, password: 12345678";
   #### If you are not a registered user yet, use: 
 - POST "/ register";
 
 
