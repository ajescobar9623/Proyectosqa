$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/BusquedaGoogle.feature");
formatter.feature({
  "name": "Google search",
  "description": "  I want to search a word in google",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Sccessfull search in google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Jhobany am on the google home page",
  "keyword": "Given "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinition.jhobany_am_on_the_google_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He does the search",
  "keyword": "When "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinition.he_does_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He validate that result is succes",
  "keyword": "Then "
});
formatter.match({
  "location": "BuscarEnGoogleStepDefinition.he_validate_that_result_is_succes()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "status": "passed"
});
});