
 
Feature: Title of your feature
  Hacer una busqueda en google con datos 

  @SmokeTest
  Scenario Outline: Buscar en google 
    Given Jhobany esta en el sitio google
    When el busca la palabra "<palabra>" compuesta "<palabrados>" 
    Then  el verifica que la palabra "<palabra>" y "<palabrados>" este en los resultados

    Examples: 
      | palabra |palabrados|  
      | switch	|  casa    |
      | sophos	|   carro  |
     
