🛒 Spring Boot REST API – Products Management

This project is a simple Spring Boot REST API for managing products.
It uses Spring Data JPA with MySQL as the database.

🚀 Features

Create a new product

Get all products

Get product by ID

Update a product

Delete a product

🛠️ Technologies

Java 17+

Spring Boot

Spring Data JPA

MySQL

Maven

⚙️ Installation & Setup
1. Clone the repository
git clone https://github.com/your-username/springrestapi.git
cd springrestapi

2. Database Setup

Create a MySQL database:

CREATE DATABASE products;

3. Configure Database (application.properties)

Inside src/main/resources/application.properties:

spring.application.name=springrestapi
spring.datasource.url=jdbc:mysql://localhost:3306/products
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


⚠️ Don’t commit your real DB password!
👉 Instead, keep a file called application-example.properties for sharing.

4. Run the project

Using Maven Wrapper:

./mvnw spring-boot:run   # Linux / Mac
mvnw.cmd spring-boot:run # Windows


Or build the jar:

./mvnw clean install
java -jar target/springrestapi-0.0.1-SNAPSHOT.jar

📌 API Endpoints
Method	Endpoint	Description
GET	/products	Get all products
GET	/products/{id}	Get product by ID
POST	/products	Create new product
PUT	/products/{id}	Update product
DELETE	/products/{id}	Delete product
Example Request (POST)
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 2500.00
}
