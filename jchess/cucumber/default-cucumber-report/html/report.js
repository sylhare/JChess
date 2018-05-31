$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/Chess.feature");
formatter.feature({
  "name": "Chess",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Display the Chess Board",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "A simple game of chess",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I check the the board",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the board is displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});