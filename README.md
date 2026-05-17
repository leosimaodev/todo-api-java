# Todo List API 🚀

API REST de gerenciamento de tarefas desenvolvida com Java + Spring Boot.

## 📌 Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Swagger/OpenAPI

---

## ✅ Funcionalidades

- Criar tarefas
- Listar tarefas
- Atualizar tarefas
- Remover tarefas

---

## 📂 Estrutura do projeto

```text
controller/
service/
repository/
entity/
```

---

## ▶️ Como executar o projeto

### 1. Clone o repositório

```bash
git clone URL_DO_SEU_REPOSITORIO
```

### 2. Entre na pasta

```bash
cd pratica-todolist
```

### 3. Execute o projeto

```bash
mvn spring-boot:run
```

---

## ⚙️ Configuração do banco de dados

Configure no arquivo:

```properties
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todolist
spring.datasource.username=root
spring.datasource.password=sua_senha
```

---

## 📚 Swagger

Após iniciar o projeto:

```text
http://localhost:8080/swagger-ui.html
```

---

## 👨‍💻 Autor

Leonardo Simão