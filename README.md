# Sistema Cursos API

API REST para gerenciamento de uma plataforma de cursos.

## Tecnologias
Java 17, Spring Boot, Spring Data JPA, PostgreSQL, Maven, Docker e REST API.

## Como executar
Pré-requisito: Docker Desktop.

    git clone https://github.com/lfillipebf-ai/sistema-cursos-api.git
    cd sistema-cursos-api
    docker compose up --build

API: http://localhost:8080

## Funcionalidades
- Cadastro de instrutores e alunos
- Cadastro de cursos
- Matrícula de alunos
- Controle de status das matrículas
- Consulta de cursos disponíveis

## Endpoints principais
- GET/POST /api/instrutores
- GET/POST /api/alunos
- GET /api/cursos
- GET /api/cursos/ativos
- POST /api/cursos
- PATCH /api/cursos/{id}/status?ativo=true|false
- GET /api/matriculas
- GET /api/matriculas/ativas
- POST /api/matriculas?alunoId=1&cursoId=1
- PATCH /api/matriculas/{id}/status?valor=CONCLUIDA

Autor: Luis Fillipe Backer Faria
GitHub: lfillipebf-ai
