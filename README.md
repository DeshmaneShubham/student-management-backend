# 🎓 Student Management System - Backend REST API

A Spring Boot RESTful API service for Student Management. Provides complete CRUD operations to insert, view, update, and delete student records with MySQL persistence and Hibernate ORM. Fully integrated and compatible with the React `frontendcrud` client application.

---

## 📋 Table of Contents

- [Features](#features)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Configuration](#configuration)
- [API Endpoints](#api-endpoints)
- [Frontend Integration](#frontend-integration)
- [How to Run](#how-to-run)
- [License](#license)

---

## ✨ Features

- **Insert Student** — Register a student with name and age (auto-generated ID).
- **Fetch All Students** — Query all student records for tables and lists.
- **Find by ID** — Search individual students by ID.
- **Update Student** — Modify an existing student's details.
- **Delete Student** — Remove a student record from the database.
- **CORS Enabled** — Directly connectable to React/Vue/Angular frontend apps running on `localhost:3000` or any host.
- **Dual Endpoint Compatibility** — Supports both RESTful path routes and custom action routes.

---

## 🛠️ Tech Stack

| Component | Technology | Version |
|---|---|---|
| Language | Java | 17 |
| Framework | Spring Boot | 3.x / 4.x compatible |
| Persistence | Spring Data JPA / Hibernate | Latest |
| Database | MySQL | 8.x |
| Build Tool | Maven | 3.9+ |

---

## 📂 Project Structure

```
StudentManagement/
├── src/main/java/com/TechnoSignia/StudentManagement/
│   ├── StudentManagementApplication.java    # Spring Boot application runner
│   ├── Controller/
│   │   └── StudentController.java           # REST endpoints with CORS & aliases
│   ├── Entity/
│   │   └── Student.java                     # JPA Entity with auto-increment ID
│   ├── Repository/
│   │   └── StudentRepo.java                 # Spring Data JPA repository
│   └── Service/
│       └── StudentService.java              # Service business logic
├── src/main/resources/
│   └── application.properties               # MySQL database connection properties
├── pom.xml
└── README.md
```

---

## ⚙️ Configuration & Prerequisites

### Prerequisites
- JDK 17+
- MySQL Server 8.x running on port `3306`

### Database Setup
Create the required database in MySQL:
```sql
CREATE DATABASE StudentCrud;
```

Check `src/main/resources/application.properties`:
```properties
spring.application.name=StudentManagement
spring.datasource.url=jdbc:mysql://localhost:3306/StudentCrud
spring.datasource.username=root
spring.datasource.password=4321
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📡 API Endpoints

| HTTP Method | Route | Description | Request Body |
|---|---|---|---|
| `POST` | `/CreateStudent` or `/insertData` | Create a new student | `{"name": "John Doe", "age": 22}` |
| `GET` | `/AllStudents` or `/allStudents` | List all students | None |
| `GET` | `/student/{id}` | Get student by ID | None |
| `PUT` | `/student/{id}` or `/update/{id}` | Update student by ID | `{"name": "John Doe", "age": 23}` |
| `DELETE` | `/student/{id}` or `/delete/{id}` | Delete student by ID | None |

---

## 🔗 Frontend Integration

This backend seamlessly pairs with the React CRUD frontend in the `frontendcrud` repository. Simply launch both applications, and the React app will manage records via `http://localhost:8080`.

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/DeshmaneShubham/student-management-backend.git
   cd student-management-backend
   ```
2. Build with Maven wrapper:
   ```bash
   ./mvnw clean package
   ```
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Access API at `http://localhost:8080`.
