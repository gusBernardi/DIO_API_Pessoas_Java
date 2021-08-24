# DIO_API_Pessoas_Java

Sistema de gerenciamento de pessoas em uma API REST com Spring Boot

Aprenda a construir do zero uma API REST com Spring Boot para cadastro e gerenciamento de pessoas de uma organização, até o Deploy na nuvem (Heroku). Pratique e veja os principais conceitos do estilo arquitetural REST envolvidos durante o desenvolvimento do projeto.

&nbsp;

Foi utilizado neste projeto:

- Java 11
- IntelliJ 2021.1.1
- Spring Boot 2.5.4 (Spring Web, Spring Data JPA, H2 Database, Lombok, Spring Boot DevTools)
- MapStruct

&nbsp;

Cadastrando pessoas:
- POST - localhost:8080/api/v1/people

![person1](https://github.com/gusBernardi/DIO_API_Pessoas_Java/blob/main/images/person1.png)
![person2](https://github.com/gusBernardi/DIO_API_Pessoas_Java/blob/main/images/person2.png)
![person3](https://github.com/gusBernardi/DIO_API_Pessoas_Java/blob/main/images/person3.png)

Listando todas as pessoas cadastradas:
- GET - localhost:8080/api/v1/people

![all](https://github.com/gusBernardi/DIO_API_Pessoas_Java/blob/main/images/getAll.png)

Retornando uma pessoa por Id:
- GET - localhost:8080/api/v1/people/2

![Id](https://github.com/gusBernardi/DIO_API_Pessoas_Java/blob/main/images/getById.png)

Atualizando o telefone de uma pessoa, ID 2:
- PUT - localhost:8080/api/v1/people/2

![updating](https://github.com/gusBernardi/DIO_API_Pessoas_Java/blob/main/images/updateById.png)

Atualizado:
- GET - localhost:8080/api/v1/people/2

![updated](https://github.com/gusBernardi/DIO_API_Pessoas_Java/blob/main/images/updateById.png)

Removendo uma pessoa, ID 2:
- DELETE - localhost:8080/api/v1/people/2

![removing](https://github.com/gusBernardi/DIO_API_Pessoas_Java/blob/main/images/removeById.png)

Removido:
- GET - localhost:8080/api/v1/people

![removed](https://github.com/gusBernardi/DIO_API_Pessoas_Java/blob/main/images/person2_Removed.png)
