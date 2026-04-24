
# L2 Interview Killer Project

## Features
- CSRF (UI)
- JWT Security (API)
- Redis Config
- Kafka Producer
- Swagger UI (/swagger-ui.html)
- Docker + docker-compose

## Run
mvn clean package
docker-compose up

## Flow
1. Login → get JWT
2. Call /api with token
3. CSRF protects UI endpoints

## Interview Points
- CSRF vs JWT
- Stateless vs Stateful
- Microservices security
