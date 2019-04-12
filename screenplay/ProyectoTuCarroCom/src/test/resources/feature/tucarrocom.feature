Feature: Realizar busqueda en Tucarro
  Realizar la busqueda de un vehiculo especifico en TuCarro.com

  @SmokeTest
  Scenario Outline: Buscar en TuCarro
    Given andres esta en la pagina web TuCarro.com
    When el busca el modelo de auto "<palabra>"
    Then el verifica que el modelo "<palabra>" este en los resultados

    Examples: 
      | palabra          |
      | Kia Picanto      |
      | Nissan tida      |
      | Chevrolet camaro |
