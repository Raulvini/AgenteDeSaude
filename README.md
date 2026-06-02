# 🏥 Sistema de Gestão de Postos de Saúde

Plataforma completa para gestão de postos de saúde, integrando um aplicativo móvel em **Flutter** a um backend robusto em **Spring Boot**. A solução automatiza o fluxo de agendamentos e dispara notificações em tempo real.

---

## 🛠️ O que o projeto faz (Funcionalidades)

* **API RESTful completa:** CRUD performático e gerenciamento do ciclo de vida de Pacientes, Médicos, Consultas e Agendamentos utilizando JPA/Hibernate e banco de dados **PostgreSQL**.
* **Motor de Agendamento:** Regras de negócio automatizadas para validar e processar marcações de consultas sem conflitos.
* **Notificações Push (FCM):** Sistema de alertas em tempo real integrado ao **Firebase Cloud Messaging**, notificando o aplicativo móvel instantaneamente sobre atualizações nas consultas.
* **Documentação com Swagger:** API totalmente documentada via **OpenAPI/Swagger**, garantindo integração limpa e testes rápidos dos endpoints.
* **Deploy na Nuvem:** Infraestrutura configurada e hospedada na plataforma **Render**, garantindo integração e entrega contínua (CI/CD) direto do GitHub.

---

## 🚀 Tecnologias

* **Backend:** Java 17, Spring Boot 3, Spring Data JPA, PostgreSQL, Swagger/OpenAPI.
* **Mobile:** Flutter, Firebase Cloud Messaging (FCM).
* **Infraestrutura:** Render (Deploy automatizado).

---

## 🔧 Como Rodar o Projeto

### 1. Backend (Spring Boot)
1. Certifique-se de ter o **Java 17** e o **PostgreSQL** configurados.
2. Acesse a pasta do backend e configure as credenciais do banco no `application.properties`.
3. Inicie o servidor:
```bash
   ./mvnw spring-boot:run
