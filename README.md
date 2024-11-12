# Sistema de Cadastro de Filmes - Locadora
Java Web - Locadora de Filmes
Este é um projeto de sistema de locadora de filmes desenvolvido em Java, utilizando Servlets, Html, Css e JSP para realizar operações CRUD (Create, Read, Update, Delete) em um banco de dados MySQL.

Funcionalidades
O sistema permite:

Incluir: Cadastrar novos filmes.
Listar: Exibir a lista completa de filmes cadastrados.
Pesquisar: Buscar filmes pelo título.
Editar: Alterar informações de um filme existente.
Excluir: Remover um filme do sistema.
Tecnologias Utilizadas
Java (Servlets)
JSP (JavaServer Pages)
MySQL (Banco de Dados)
JDBC (Java Database Connectivity)
Estrutura do Projeto
css
Copiar código
locadora
├── src
│   ├── controller
│   │   └── FilmeServlet.java
│   ├── model
│   │   └── Filme.java
│   └── dao
│       └── FilmeDAO.java
├── WebContent
│   ├── index.jsp
│   ├── listarFilmes.jsp
│   ├── adicionarFilme.jsp
│   ├── editarFilme.jsp
└── WEB-INF
    └── web.xml
Pré-requisitos
JDK 8 ou superior
Apache Tomcat 9 ou superior
MySQL 5.7 ou superior
MySQL Connector/J (mysql-connector-java.jar) para conexão com o banco de dados
Configuração do Banco de Dados
Acesse o MySQL e crie o banco de dados e a tabela com o seguinte comando SQL:

sql
Copiar código
CREATE DATABASE locadora;
USE locadora;

CREATE TABLE filmes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    genero VARCHAR(100),
    data_lancamento DATE
);
Insira alguns registros iniciais, se desejar:

sql
Copiar código
INSERT INTO filmes (titulo, genero, data_lancamento) VALUES
('Inception', 'Ficção Científica', '2010-07-16'),
('The Godfather', 'Drama', '1972-03-24'),
('Toy Story', 'Animação', '1995-11-22');
Configuração do Projeto
Clone o repositório ou baixe o código fonte.
Importe o projeto para sua IDE (Eclipse ou IntelliJ).
Adicione o MySQL Connector ao projeto:
Baixe o mysql-connector-java.jar (disponível em https://dev.mysql.com/downloads/connector/j/).
Adicione o JAR ao Build Path do projeto.
Configure o Apache Tomcat:
Adicione o Tomcat ao projeto e configure a porta (normalmente 8080).
Configure o Banco de Dados no DAO:
No arquivo FilmeDAO.java, configure a URL de conexão, o usuário e a senha do MySQL:
java
Copiar código
private final String jdbcURL = "jdbc:mysql://localhost:3306/locadora";
private final String jdbcUsername = "seu_usuario";
private final String jdbcPassword = "sua_senha";
Compile e execute o projeto:
Inicie o servidor Apache Tomcat e acesse o sistema via navegador em http://localhost:8080/locadora.
Navegação
Página Inicial: Listagem de filmes cadastrados.
Adicionar Filme: Formulário para cadastrar um novo filme.
Editar Filme: Página para editar as informações de um filme.
Excluir Filme: Botão na listagem para remover um filme do banco de dados (com confirmação).
Tratamento de Erros
O sistema realiza validação de campos obrigatórios ao cadastrar ou editar filmes.
Caso ocorra erro de conexão com o banco de dados, uma mensagem de erro será exibida.
