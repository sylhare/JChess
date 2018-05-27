package com.github.sylhare

import cucumber.api.scala.{EN, ScalaDsl}
import cucumber.api.PendingException

class StepDefinitions extends ScalaDsl with EN {

  Given("^A game of chess$") { () =>
    throw new PendingException()
  }

  When("^I check the the board$") { () =>
    throw new PendingException()
  }

  Then("^the board is displayed$") { () =>
    throw new PendingException()
  }

}
