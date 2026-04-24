# 🔐 Spring Security CSRF + JWT

## 🚀 Overview

This project demonstrates a **production-style hybrid security architecture** using:

* Spring Security 6
* CSRF Protection (for UI)
* JWT Authentication (for APIs)
* Redis (caching/session ready)
* Kafka (event-driven design)
* Docker (containerization)

---

## 🧠 Architecture

```
Browser (UI)
   ↓
Session + CSRF Protection
   ↓
Secure Endpoints (/transfer)

----------------------------------

Client (Postman / Frontend)
   ↓
JWT Token (Authorization Header)
   ↓
Stateless APIs (/api/**)
```

---

## 🔐 Security Design

| Layer | Security               |
| ----- | ---------------------- |
| UI    | Session + CSRF         |
| API   | JWT (Stateless)        |
| Redis | Session/Caching        |
| Kafka | Async Event Processing |

---

## ⚔️ CSRF Demo

### ✅ Secure Flow

* `/` → form with CSRF token
* `/transfer` → works

### ❌ Attack Simulation

* `/attack` → fake form
* CSRF token missing → **403 Forbidden**

---

## 🔑 JWT Flow

### 1. Generate Token

```
POST /auth/login?username=ram
```

### 2. Call API

```
GET /api/hello
Authorization: Bearer <token>
```

---

## 🧪 Run Project

### ▶️ Without Docker

```
mvn spring-boot:run
```

### 🐳 With Docker

```
mvn clean package
docker-compose up
```

---

## 📊 Swagger UI

👉 http://localhost:8080/swagger-ui.html

---

## 🎯 Key Points

* CSRF vs JWT
* Stateful vs Stateless authentication
* Why CSRF is not required for JWT
* Microservices security architecture
* Event-driven systems using Kafka

---

## 💡 Key Takeaway

> CSRF protection is required only when authentication is cookie-based.
> Stateless APIs using JWT are not vulnerable to CSRF.

---

## 👨‍💻 Author

**Ram Paraselli**
🔗 [LinkedIn](https://linkedin.com/in/ram-paraselli)
🔗 [GitHub](https://github.com/Paraselli)

---

## ⭐ If you like this project, give it a star!

