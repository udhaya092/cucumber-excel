$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Fbexcel.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
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
  "name": "cus in fb login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.cus_in_fb_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cus enters the details",
  "keyword": "When "
});
formatter.match({
  "location": "Login.cus_enters_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "success",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.success()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});