<h1>API de e-commerce básico usando Java e Spring Boot</h1> 

<p align="center">
  <img src="http://img.shields.io/static/v1?label=Java&message=17&color=ED8B00&style=for-the-badge&logo=java"/>
  <img src="http://img.shields.io/static/v1?label=Spring Boot&message=3.0.3&color=green&style=for-the-badge&logo=Spring Boot"/>
  <img src="https://img.shields.io/static/v1?label=PostgreSQL&message=15&color=336791&style=for-the-badge&logo=postgresql"/>
  <img src="http://img.shields.io/static/v1?label=License&message=MIT&color=green&style=for-the-badge"/>
  <img src="http://img.shields.io/static/v1?label=STATUS&message=concluIdo&color=GREEN&style=for-the-badge"/>
</p>

> Status do Projeto: :heavy_check_mark:(concluído)

### Tópicos 

:small_blue_diamond: [Descrição do projeto](#descrição-do-projeto)

:small_blue_diamond: [Tecnologias](#tecnologias)

:small_blue_diamond: [Pré-requisitos](#pré-requisitos)

:small_blue_diamond: [Como rodar a aplicação](#como-rodar-a-aplicação-arrow_forward)




## Descrição do projeto 


<p align="justify">
  O projeto é uma API desenvolvida com Java e Spring Boot, que tem como objetivo simular um ambiente de E-commerce. Para garantir a alta qualidade do código, foram aplicadas as boas práticas de arquitetura REST e a separação de responsabilidades com o padrão MVC. A integração com o banco de dados PostgreSQL, realizada por meio do Spring Data JPA, permite a persistência dos dados de maneira confiável e segura. A API oferece endpoints para operações de CRUD de usuários e consulta em tabelas como produtos e pedidos. Embora não possua todas as funcionalidades de um E-commerce completo, a estrutura é robusta e escalável, permitindo facilmente a adição de novas funcionalidades e melhorias no futuro.
</p>


## Layout
### Diagrama de Entidade-Relacionamento
![DER](https://github.com/iTarsz/web-service-springboot3-jpa/blob/main/assets/DER.png)
### Todos os EndPoints
![EndPoints](https://github.com/iTarsz/web-service-springboot3-jpa/blob/main/assets/endpoints.png)
### Salvando um novo Usuario
![postUser](https://github.com/iTarsz/web-service-springboot3-jpa/blob/main/assets/postUser.png)
### Consultando lista de usuarios cadastrados
![getUsers](https://github.com/iTarsz/web-service-springboot3-jpa/blob/main/assets/getUsers.png)

## Tecnologias
• Java

• Spring Boot

• JPA / Hibernate

• Maven

## Pré-requisitos

:warning: [Java 17 (LTS)](https://www.azul.com/downloads/?package=jdk#download-openjdk)

:warning: [PostgreSQL 15](https://www.postgresql.org/download/windows/)

:warning: [Eclipse](https://www.eclipse.org/downloads/) ou [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=windows)



## Como rodar a aplicação :arrow_forward:

No terminal, clone o projeto: 

```
git clone https://github.com/iTarsz/web-service-springboot3-jpa
```
Importe a pasta na sua IDE

Crie o banco de dados no PostgreSQL

Em application-dev.properties mude a Url, username e password de acordo com o banco de dados que voce criou anteriormente

Execute: Clique com o botao direito em WebServiceApplication.java > Run As > Java Application
