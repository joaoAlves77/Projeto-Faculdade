# Sistema de Cadastro de Filmes - Locadora

Este é um projeto de sistema de locadora de filmes desenvolvido em Java, utilizando Servlets e JSP para realizar operações CRUD (Create, Read, Update, Delete) em um banco de dados MySQL.

## Funcionalidades

O sistema permite:
- **Incluir**: Cadastrar novos filmes.
- **Listar**: Exibir a lista completa de filmes cadastrados.
- **Editar**: Alterar informações de um filme existente.
- **Excluir**: Remover um filme do sistema.

## Tecnologias Utilizadas

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)

## Pré-requisitos

- **JDK 8** ou superior
- **Apache Tomcat** 9 ou superior
- **MySQL** 5.7 ou superior
- **MySQL Connector/J** (`mysql-connector-java.jar`) para conexão com o banco de dados

## Configuração do Banco de Dados

1. Acesse o MySQL e crie o banco de dados e a tabela com o seguinte comando SQL:

   ```sql
   CREATE DATABASE dbfilme;
   USE dbfilme;

   CREATE TABLE filmes (
       id INT AUTO_INCREMENT PRIMARY KEY,
       nome VARCHAR(255) NOT NULL,
       autor VARCHAR(100),
       descricao VARCHAR(250)
   );

![image](https://github.com/user-attachments/assets/4483c818-8db8-4274-82d0-336641af5384)
