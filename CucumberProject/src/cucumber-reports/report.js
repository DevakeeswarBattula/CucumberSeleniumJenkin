$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Skeleton/case1addprod.feature");
formatter.feature({
  "name": "AddCart feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Product AddCart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addproduct"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter url of app",
  "keyword": "Given "
});
formatter.match({
  "location": "Case1LoginStepDefs.user_enter_url_of_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter data for Addcart",
  "keyword": "When "
});
formatter.match({
  "location": "Case1LoginStepDefs.user_enter_data_for_Addcart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product add successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Case1LoginStepDefs.product_add_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});