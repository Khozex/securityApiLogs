# Log Secure API

Este é um projeto Java simples com Spring Boot que demonstra como proteger informações sensíveis em logs utilizando um `logback.xml` personalizado com um layout que aplica máscaras via expressões regulares.

## Objetivo

Evitar o vazamento de dados pessoais e sensíveis, como e-mails e códigos de autenticação (opt-in), nos logs da aplicação. O exemplo cobre tanto o uso de `toString()` protegido em DTOs quanto a substituição automática via regex aplicada no layout do Logback.

## Como executar

1. Clone o repositório
2. Compile e execute o projeto com:

```bash
./mvnw spring-boot:run
```

3. Faça uma requisição POST:

```bash
curl -X POST http://localhost:8080/api/optin \
  -H "Content-Type: application/json" \
  -d '{
    "email": "usuario@example.com",
    "optInCode": "123456"
  }'
```

## Requisitos

- Java 17
- Gradle
- Spring Boot 3.x
