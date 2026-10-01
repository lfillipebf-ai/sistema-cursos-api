# Sistema Cursos API

API REST para gerenciamento de uma plataforma de cursos, desenvolvida como projeto de portfólio/estudo.

## Tecnologias
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Docker / Docker Compose
- REST API

## Funcionalidades
- Cadastro de instrutores
- Cadastro de cursos
- Matrícula de alunos
- Controle de status das matrículas
- Consulta de cursos disponíveis
- Persistência em PostgreSQL

**Autor:** Luis Fillipe Backer Faria  
**GitHub:** lfillipebf-ai

## Endpoints principais
- GET/POST `/api/instrutores`
- GET/POST `/api/alunos`
- GET `/api/cursos`
- GET `/api/cursos/ativos`
- POST `/api/cursos`
- PATCH `/api/cursos/{id}/status?ativo=true|false`
- GET `/api/matriculas`
- GET `/api/matriculas/ativas`
- POST `/api/matriculas?alunoId=1&cursoId=1`
- PATCH `/api/matriculas/{id}/status?valor=CONCLUIDA`
