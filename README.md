# Tour Package REST API (Spring Boot + PostgreSQL)

This is a Spring Boot-based RESTful API for managing **Tour Packages**.  
It supports **CRUD operations** and additional methods to get a Tour Package by ID, update by ID, and delete by ID.

---

## 📌 Features
- **Create** a new Tour Package
- **Get All** Tour Packages
- **Get by ID** 
- **Update by ID** (extra method)
- **Delete by ID** (extra method)
- Uses **PostgreSQL** database
- Built with **Spring Boot**
- REST endpoints tested using **Postman**


---


###📍 API Endpoints & Postman Testing
| Method     | Endpoint          | Description             | Headers                          | Body (if required)                                                                                                                                                                                 |
| ---------- | ----------------- | ----------------------- | -------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **POST**   | `/api/tours`      | Create new tour package | `Content-Type: application/json` | **raw → JSON**: <br>`json { "image": "https://images.unsplash.com/photo-123456", "title": "Goa Trip", "description": "Beach tour", "price": 5000, "discountInPercentage": "10%" }`                 |
| **GET**    | `/api/tours`      | Get all tour packages   | None                             | None                                                                                                                                                                                               |
| **GET**    | `/api/tours/{id}` | Get package by ID       | None                             | None                                                                                                                                                                                               |
| **PUT**    | `/api/tours/{id}` | Update package by ID    | `Content-Type: application/json` | **raw → JSON**: <br>`json { "image": "https://images.unsplash.com/photo-654321", "title": "Updated Goa Trip", "description": "Updated beach tour", "price": 5500, "discountInPercentage": "15%" }` |
| **DELETE** | `/api/tours/{id}` | Delete package by ID    | None                             | None                                                                                                                                                                                               |


---

## 🛠️ Technologies Used
- **Java 17**
- **Spring Boot** (Web, Data JPA)
- **PostgreSQL**
- **Maven**
- **STS (Spring Tool Suite)** IDE
- **Postman** (for API testing)

---

## 📂 Project Structure
src/

├── main/

│ ├── java/ (Java source files)

│ ├── resources/

│ ├── application.properties (DB config)

│ ├── static/ (if any frontend files)

│ ├── templates/ (if any HTML files)

└── test/ (JUnit tests)
pom.xml



---

## ⚙️ Setup Instructions

##1️⃣ Clone the Repository
```bash
git clone https://github.com/YOUR_GITHUB_USERNAME/YOUR_REPOSITORY_NAME.git

##2️⃣ Import into IDE
Open Spring Tool Suite (STS) or IntelliJ IDEA.

Go to File → Import → Maven → Existing Maven Projects.

Select the cloned project folder and finish importing.

##3️⃣ Configure Database
Install and run PostgreSQL.

Create a database:

CREATE DATABASE tourdb;
Update the application.properties file:

properties

spring.datasource.url=jdbc:postgresql://localhost:5432/tourdb
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


##4️⃣ Run the Application

mvn spring-boot:run
or run directly from STS by right-clicking the project → Run As → Spring Boot App.

##5️⃣ Test Endpoints in Postman
Method	Endpoint	Description
POST	/api/tours	Create a tour
GET	/api/tours	Get all tours
GET	/api/tours/{id}	Get tour by ID
PUT	/api/tours/{id}	Update tour by ID
DELETE	/api/tours/{id}	Delete tour by ID

##📌 Extra Notes
This project contains two extra methods:

Update by ID (PUT /api/tours/{id})

Delete by ID (DELETE /api/tours/{id})

You can customize database credentials in application.properties.

Make sure PostgreSQL service is running before starting the app.

##📜 License
This project is open-source and free to use for learning purposes.



---

If you want, I can also **add an example `application.properties`** and a **sample cURL command section** so someone can test without Postman.  
Do you want me to include that too?
