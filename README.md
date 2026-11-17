# qa-automation-serenity

Suite de automatización de pruebas de API sobre **camioneros-app** (API REST Node/Express/PostgreSQL multi-tenant), construida con **Java 17 + Serenity BDD + Cucumber + Screenplay + RestAssured**.

> 🚧 En construcción.

## Qué testea (planificado)
- Autenticación (login, credenciales inválidas, sesión ausente o adulterada)
- CRUD de Viajes con validación de JSON Schema
- Aislamiento multi-tenant (BOLA, OWASP API1)
- Validaciones de input (400)
- Verificación de persistencia con SQL (JDBC → PostgreSQL)

## Stack
Java 17 · Maven Wrapper · Serenity BDD 5 · Cucumber 8 (Gherkin) · Screenplay · RestAssured · JUnit Platform · GitHub Actions
