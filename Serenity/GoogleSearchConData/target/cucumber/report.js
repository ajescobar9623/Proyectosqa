$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:resources/feature/GoogleSearchConData.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  Hacer una busqueda en google con datos ",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Jhobany esta en el sitio google",
  "keyword": "Given "
});
formatter.step({
  "name": "el busca la palabra \"\u003cpalabra\u003e\" compuesta \"\u003cpalabrados\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "el verifica que la palabra \"\u003cpalabra\u003e\" y \"\u003cpalabrados\u003e\" este en los resultados",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "palabra",
        "palabrados"
      ]
    },
    {
      "cells": [
        "switch",
        "casa"
      ]
    },
    {
      "cells": [
        "sophos",
        "carro"
      ]
    },
    {
      "cells": [
        "kkkkkkkkkkkkkkk",
        "moto"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Jhobany esta en el sitio google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchStepdefinitions.jhobanyEstaEnElSitioGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"switch\" compuesta \"casa\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchStepdefinitions.elBuscaLaPalabra(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica que la palabra \"switch\" y \"casa\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepdefinitions.elVerificaQueLaPalabraEsteEnLosResultados(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Jhobany esta en el sitio google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchStepdefinitions.jhobanyEstaEnElSitioGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"sophos\" compuesta \"carro\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchStepdefinitions.elBuscaLaPalabra(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica que la palabra \"sophos\" y \"carro\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepdefinitions.elVerificaQueLaPalabraEsteEnLosResultados(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buscar en google",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "Jhobany esta en el sitio google",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSearchStepdefinitions.jhobanyEstaEnElSitioGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el busca la palabra \"kkkkkkkkkkkkkkk\" compuesta \"moto\"",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSearchStepdefinitions.elBuscaLaPalabra(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el verifica que la palabra \"kkkkkkkkkkkkkkk\" y \"moto\" este en los resultados",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepdefinitions.elVerificaQueLaPalabraEsteEnLosResultados(String,String)"
});
formatter.result({
  "status": "passed"
});
});