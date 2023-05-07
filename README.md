<h1 align="center">CRUD agenda de contatos</h1>

Criação de um crud com react no frontend consumindo a uma API para gerenciamento de cadastro de uma agenda.

## 🛠️ Ferramentas e Tecnologias

- Spring boot
- Swagger 
- React
- MySQL
- VS Code
- Spring Tools Suite (STS)
- Git bash

## ⚙ Funcionalidades

- Criar cadastro de usuário
- Ler cadastro de usuário
- Atualizar um usuário específico
- Deletar um usuárop específico
  
## 💻 Como executar o Frontend React

- Clone esse repositório:

  ```$ git clonegit@github.com:Joseneeto/agenda-blue.git```

- Entre no diretório do projeto: 

  ```$ cd agenda-blue/frontend/front-react```
  
- Abrir o git bash no diretório:

  ```$ code .```
  
- Instale o gerenciador de pacotes do Node:

  ```$ npm install```

- Instale o gerenciador de pacotes do Node:

  ```$ npm start```

- URL para acessar servidor local:

  ```acesse http://localhost:3000/```
  
  
## 💻 Como executar o Backend

Antes de iniciar a aplicação é necessário a instalação do banco de dados MySQL e do Spring Tools Suite (STS).

- Clone esse repositório:

  ```$ git clone git@github.com:Joseneeto/agenda-blue.git```

- Inicie a aplicação do STS localize a pasta 'backend' no diretório do projeto e execute a aplicação. 

- URL local da aplicação:

  ```acesse http://localhost:8080```
  
- URL Swagger da aplicação:

  ```acesse http://localhost:8080/swagger-ui.html#//```


## 🚉 Rotas da API

- Rota ```/listar``` (método ```GET```): Retorna todos usários cadastrados na API

- Rota ```/cadastrar``` (método ```POST```): Cria um cadastro de usuário na API

- Rota ```/alterar``` (método ```PUT```): Atualiza um cadastro de usuário na API

- Rota ```/remover/id``` (método ```DELETE```): Deleta um cadastro de usuário na API baseado no ```id```
