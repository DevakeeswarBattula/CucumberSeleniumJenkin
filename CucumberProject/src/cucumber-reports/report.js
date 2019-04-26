$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Skeleton/demowebshop.feature");
formatter.feature({
  "name": "DemoWebShop Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "RegisterScenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "url of the demowebshop",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterStepDefs.url_of_the_demowebshop()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat Skeleton.RegisterStepDefs.url_of_the_demowebshop(RegisterStepDefs.java:35)\r\n\tat ✽.url of the demowebshop(file:src/test/resources/Skeleton/demowebshop.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters the data for registration",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterStepDefs.user_enters_the_data_for_registration()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefs.user_is_registered_successfully()"
});
formatter.result({
  "status": "skipped"
});
});