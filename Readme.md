# Spring REST API Example

A simple REST API built with Spring Boot and MySQL.

## Features
- CRUD operations on `Products`
- REST endpoints using Spring Web
- Database persistence with Spring Data JPA

## Endpoints
- `GET /products` → Get all products
- `GET /products/{id}` → Get product by ID
- `POST /products` → Create new product
- `PUT /products` → Update product
- `DELETE /products/{id}` → Delete product by ID

## How to Run
1. Clone the repo
2. Configure `application.properties` with your DB credentials
3. Run:
   ```bash
   mvn spring-boot:run
Copy code
