package com.github.sylhare;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepChess {
    @Given("^A game of chess$")
    public void a_game_of_chess() throws Throwable{
        App chess = new App();
    }

    @When("^I check the the board$")
    public void iCheckTheTheBoard() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the board is displayed$")
    public void theBoardIsDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
