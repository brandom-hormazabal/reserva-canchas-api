# Reserva Canchas API

API REST para gestionar la reserva de canchas deportivas (fútbol, pádel): usuarios, roles, disponibilidad horaria y reservas sin choques de horario.

> **Estado:** en desarrollo. Proyecto de portafolio construido paso a paso; el roadmap de abajo muestra qué está hecho y qué falta.

## Stack

- Java 21
- Spring Boot (Web, Data JPA, Security, Validation)
- PostgreSQL
- Docker / Docker Compose
- JUnit 5 + Mockito
- GitHub Actions (CI)

## Roadmap

- [X] Esqueleto del proyecto y primer endpoint
- [ ] Modelo de datos: usuarios, canchas, reservas
- [ ] CRUD de canchas (rol administrador)
- [ ] Reservas con validación de choques de horario
- [ ] Autenticación con JWT y roles (cliente / administrador)
- [ ] Persistencia en PostgreSQL con Docker Compose
- [ ] Tests unitarios y de integración
- [ ] Integración continua con GitHub Actions
- [ ] Documentación de la API (OpenAPI/Swagger)
- [ ] Frontend (React)

## Cómo ejecutarlo

Pendiente: se documentará cuando exista el primer endpoint.

## Autor

Brandom Hormazábal — estudiante de Ingeniería en Informática (Duoc UC).
