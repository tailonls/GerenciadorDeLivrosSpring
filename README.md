# GerenciadorDeLivrosSpring
Projeto de API Spring para gerenciar livros feitos no curso da Udemy


**Tecnologias:**

    Java
    Maven
    Spring Boot
    Heroku

**Swagger em ambiente de DEV:**

http://localhost:8080/swagger-ui/index.html

**Swagger deploiado no Heroku:**

https://gerenciador-de-livros-spring.herokuapp.com/swagger-ui/index.html


**Exemplo de request:**

    {
        "id": 1,
        "name": "Minha vida como Dev",
        "pages": 200,
        "chapters": 10,
        "isbn": "000001",
        "publisherName": "Atlas Editora",
        "author": {
            "id": 1,
            "name": "Tailon Saraiva",
            "age": "28"
        }
    }

**Criar App no Heroku:**
    
    1 Create New App (nome-com-esse-padrao)
    2 Adicionar dados do repositório no Git
    3 Enable Automatic Deploy
    4 Criar arquivo no projeto chamado de system.properties com o conteúdo:

        java.runtime.version=14

    5 Após atualizar novo código um novo Build vai iniciar e fazer o deploy do projeto 