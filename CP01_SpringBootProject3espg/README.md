# 🚘 Projeto Autoescola - Arquitetura Orientada a Serviços (SOA) e Web Services

## 📌 Integrantes do Grupo
1. Bernardo Pinto Rocha - RM99209  
2. Gabriel Diegues - RM550788  
3. Luiza Cristina - RM99367  
4. Pedro Palladino - RM551180  
5. Renato Izumi - RM99242  

---

## 📖 Descrição
Este projeto consiste em uma aplicação **Spring Boot** (Java 17) que implementa uma API REST para gerenciar **Alunos** e **Instrutores** de uma Autoescola.  

Funcionalidades:
- Cadastro, listagem, atualização e exclusão lógica de **Alunos**.  
- Cadastro, listagem, atualização e exclusão lógica de **Instrutores**.  
- Gestão de **Endereços** vinculados a Alunos e Instrutores.  
- Endpoints REST documentados seguindo boas práticas de desenvolvimento.

---

## 🛠 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database** (ambiente de testes)
- **Maven**

---

## ▶️ Como Executar o Projeto

### Pré-requisitos
- JDK 17 instalado
- Maven instalado

### Passos
1. Clone o repositório ou extraia o `.zip`.
2. Acesse a pasta do projeto:
   ```bash
   cd CP01_SpringBootProject3espg
   ```
3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```
4. A API ficará disponível em:  
   ```
   http://localhost:8080
   ```

---

## 🔗 Endpoints Principais

### Alunos
- `POST /alunos` → Cadastrar aluno  
- `GET /alunos` → Listar alunos ativos  
- `PUT /alunos/{id}` → Atualizar dados do aluno (exceto CPF e e-mail)  
- `DELETE /alunos/{id}` → Exclusão lógica  

### Instrutores
- `POST /instrutores` → Cadastrar instrutor  
- `GET /instrutores` → Listar instrutores ativos  
- `PUT /instrutores/{id}` → Atualizar dados do instrutor (exceto CNH e e-mail)  
- `DELETE /instrutores/{id}` → Exclusão lógica  

### Health Check
- `GET /health` → Verificar se a API está no ar  

---

## 📂 Estrutura do Projeto
```
src/main/java/br/com/fiap3espg/spring_boot_project
 ├── aluno/          # Classes relacionadas a alunos
 ├── instrutor/      # Classes relacionadas a instrutores
 ├── endereco/       # Entidades de endereço
 ├── controller/     # Controllers REST
 └── SpringBootProject3EspgApplication.java  # Classe principal
```

---

## ✅ Melhorias Futuras
- Implementar agendamento de aulas (Instrutor x Aluno).  
- Adicionar testes unitários e de integração (JUnit + Spring Boot Test).  
- Documentar a API com Swagger/OpenAPI.  
- Criar camada de autenticação/autorização (JWT).  

---

## 👨‍💻 Autores
Projeto desenvolvido como parte do **Checkpoint 1** da disciplina **Arquitetura Orientada a Serviços (SOA) e Web Services**.

## Link Do Github: https://github.com/BernardoPRocha/CP01_SpringBootProject3espg.git
