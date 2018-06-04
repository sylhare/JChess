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
formatter.match({
  "location": "Steps.a_game_of_chess()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check the the board",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_check_the_the_board()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.github.sylhare.Steps.i_check_the_the_board(Steps.java:23)\n\tat ✽.I check the the board(./src/test/resources/features/Chess.feature:5)\n",
  "status": "pending"
});
formatter.step({
  "name": "the board is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.the_board_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});