#Author: binho.castro2.0@gmail.com

Feature: Realizar Pesquisar
 Eu como usuario quero realizar pesquisas no google para receber as informacoes 
 
 Scenario: Pesquisar o MvRepository 
    Given que eu esteja no "https://mvnrepository.com/"
    Then valido informacao
    
  Scenario: Pesquisar no google Scrum
    Given que eu esteja no "https://www.google.com.br"
    When pesquisar por "Scrum livro"
    Then valido as informacao
    
   Scenario: Perfil Github 
    Given que eu esteja no "https://github.com/AbnerDavis"  
    Then valido a informacao
 
