Feature: Search in google with data from feature
  Arthur quiere hacer una busqueda en google con datos

  @SmokeTest
  Scenario Outline: buscar en google
    Given arthur esta en el sitio de google
    When el busca la frase "<palabra>" compuesta "<palabrados>"
    Then el verifica que la palabra "<resultadoEsperado>" este en los resultados

    Examples: 
      | palabra   | palabrados | resultadoEsperado |
      | porshe    | turbo      | porshe turbo      |
      | toch      | pad        | touch pad         |
      | chevrolet | camaro     | chevrolet camaro  |
