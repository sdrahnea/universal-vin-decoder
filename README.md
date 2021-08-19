# Universal VIN Decoder

Universal VIN Decoder is a tool to decode car's vin (vehicle identification number)

## 1. Getting Started

Clone or download a copy of this project.

### 1.1 Prerequisites

This project requires Java 1.8, MySQL and Maven.

### 1.2 Installing

After MySQL instalation, it is required to create a dabase:

```
CREATE DATABSE uvd;
```
Execute the content of `.sql` files, such as: 
```
chart_type.sql
data.sql
```
Note: in case that you run the application starting with MySQL 8.0.4, please execute the following query:
```
ALTER USER '${USER}'@'localhost' IDENTIFIED WITH mysql_native_password BY '${PASSWORD}';
-- where ${USER} and ${PASSWORD} should be provided. 
```
All this files contains initial data. Just copy and paste the file's content Go to downloaded folder and create the build (you should have something similar like the following):
```
SDR:universal-vin-decoder sdrahnea$ mvn clean compile package
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< com.uvd:universal-vin-decoder >-------------------
[INFO] Building universal-vin-decoder 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.6.1:clean (default-clean) @ universal-vin-decoder ---
[INFO] Deleting /my-projects/universal-vin-decoder/target
[INFO] 
[INFO] --- maven-enforcer-plugin:1.4.1:enforce (enforce-versions) @ universal-vin-decoder ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ universal-vin-decoder ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 69 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ universal-vin-decoder ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 127 source files to /my-projects/universal-vin-decoder/target/classes
[INFO] /my-projects/universal-vin-decoder/src/main/java/com/oms/controller/AbstractController.java: Some input files use unchecked or unsafe operations.
[INFO] /my-projects/universal-vin-decoder/src/main/java/com/oms/controller/AbstractController.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-enforcer-plugin:1.4.1:enforce (enforce-versions) @ universal-vin-decoder ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ universal-vin-decoder ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 69 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:compile (default-compile) @ universal-vin-decoder ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ universal-vin-decoder ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /my-projects/universal-vin-decoder/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.7.0:testCompile (default-testCompile) @ universal-vin-decoder ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ universal-vin-decoder ---
[INFO] No tests to run.
[INFO] 
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ universal-vin-decoder ---
[INFO] Building jar: /my-projects/universal-vin-decoder/target/universal-vin-decoder-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:1.5.7.RELEASE:repackage (default) @ universal-vin-decoder ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.183 s
[INFO] Finished at: 2019-01-10T10:14:15+02:00
[INFO] ------------------------------------------------------------------------
SDR:universal-vin-decoder sdrahnea$ 
```

## 2. Running the tests

This project does not have any kind of tests :).

## 3. Deployment

Once the build (the jar file) is ready the application can be run. Please, use the following command to run the application:
```
SDR:universal-vin-decoder sdrahnea$ java -jar target/universal-vin-decoder-0.0.1-SNAPSHOT.jar
```
If was used default configuration then the application should be available at this url: http://localhost:8081/oms/login.xhtml 
Use the following credentials: username: admin, password: 123.

## 4. Built With

* [Java](https://www.java.com/en/download/) - Java technology allows you to work and play in a secure computing environment. Java allows you to play online games, chat with people around the world, calculate your mortgage interest, and view images in 3D, just to name a few.
* [PrimeFaces](https://www.primefaces.org/) - PrimeFaces is a popular open source framework for JavaServer Faces featuring over 100 components, touch optimized mobilekit, client side validation, theme engine and more.
* [Spring Security](https://spring.io/projects/spring-security) - Spring Security is a powerful and highly customizable authentication and access-control framework. It is the de-facto standard for securing Spring-based applications.
* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
* [Spring Data](https://spring.io/projects/spring-data) - Spring Data’s mission is to provide a familiar and consistent, Spring-based programming model for data access while still retaining the special traits of the underlying data store.
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Spring Data JPA, part of the larger Spring Data family, makes it easy to easily implement JPA based repositories. This module deals with enhanced support for JPA based data access layers. It makes it easier to build Spring-powered applications that use data access technologies.
* [MySQL](https://www.mysql.com/) - MySQL is the world's most popular open source database. Whether you are a fast growing web property, technology ISV or large enterprise, MySQL can cost-effectively help you deliver high performance, scalable database applications.
* [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information. 

## 5. Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## 6. Versioning

We use [SemVer](http://semver.org/) for versioning.

## 7. Authors

* **Sergiu Drahnea** - *Initial work* - [LinkedIn](https://www.linkedin.com/in/sergiu-drahnea-563745123)

## 8. License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## 9. Donation
* [PayPal](https://www.paypal.me/sdrahnea) - any donation is welcomed in case that you was pleased with this work :p

