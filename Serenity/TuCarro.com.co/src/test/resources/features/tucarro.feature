Feature: Tucarro
  Hacer una busqueda en la pagina web TuCarro.com

  @SmokeTest
  Scenario Outline: Buscar en TuCarro
    Given Jhobany esta en la pagina web TuCarro.com
    When el busca el modelo de auto "<palabra>"
    Then el verifica que el modelo este en los resultados

    Examples: 
      | palabra |
      | picanto |
