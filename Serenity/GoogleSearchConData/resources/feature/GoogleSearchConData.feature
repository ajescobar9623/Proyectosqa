#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  Hacer una busqueda en google con datos 

  @tag2
  Scenario Outline: Buscar en google 
    Given Jhobany esta en el sitio google
    When el busca la palabra "<palabra>" compuesta "<palabrados>" 
    Then  el verifica que la palabra "<palabra>" y "<palabrados>" este en los resultados

    Examples: 
      | palabra |palabrados|  
      | switch	|  casa    |
      | sophos	|   carro  |
      | kkkkkkkkkkkkkkk	|moto |    
      
