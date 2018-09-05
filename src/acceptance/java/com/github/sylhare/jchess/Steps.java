package com.github.sylhare.jchess;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Steps {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Given("^A simple game of chess$")
    public void a_game_of_chess() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //System.setOut(new PrintStream(outContent));
        ChessBoard Chess = new ChessBoard();
    }

    @When("^I check the the board$")
    public void i_check_the_the_board() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the board is displayed$")
    public void the_board_is_displayed() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}