# 🎓 Online Examination System (Backend)

This is a robust Backend System for an Online Examination Portal developed using **Spring Boot**. The project demonstrates advanced concepts like **Redis Caching**, **Docker Containerization**, and **MySQL Database** management.

## 🚀 Technical Highlights
* **Java 17 & Spring Boot 3.x**: High-performance backend logic.
* **MySQL**: Relational database for persistent storage of Users, Categories, and Quizzes.
* **Redis Cache**: Integrated to improve application speed by caching frequently accessed exam data.
* **Docker**: Full infrastructure setup using `docker-compose` for MySQL and Redis.
* **JPA/Hibernate**: For efficient database operations.

## 🛠️ Infrastructure (Docker)
The project includes a `docker-compose.yml` file to spin up:
- **MySQL** on port `3306`
- **Redis** on port `6379`

## 📡 API Endpoints
- `POST /api/categories/` - Add new category
- `GET /api/categories/` - List all categories (Cached via Redis)
