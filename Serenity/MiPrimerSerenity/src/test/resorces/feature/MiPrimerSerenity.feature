Feature: Title of your feature
  Hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: Buscar en google
    Given Jhobany esta en el sitio google
    When el busca la palabra "<palabra>"
    Then el verifica que la este en el resultado

    Examples: 
      | palabra |
      | porshe  |
      | camaro  |
      | kia     |
