@regressivos
Feature: Testes de api para validar lista de usuarios
Como api 
Quero acessar o endpoint da lista de usuarios
Para realizar a consulta e validacao do retorno

    Background: acessar o servico
    Given a base URL 
    

  @listausuario
  Scenario: validar status code
  When o cliente faz uma solicitacao GET 
  Then o codigo de status de resposta deve ser 200
   


