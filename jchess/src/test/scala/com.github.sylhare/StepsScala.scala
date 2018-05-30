package com.github.sylhare

import cucumber.api.scala.{EN, ScalaDsl}

class StepsScala extends ScalaDsl with EN {

  var chess: ChessBoard = _
  var result: String = _

  Given("^A game of chess$") { () =>
    chess = new ChessBoard()
  }

  When("^I check the the board$") { () =>
    result = chess.CheckBoard()
  }

  Then("^the board is displayed$") { () =>
    assert(result == "* Chess ChessBoard:\n" + "*\n" + "*      a  b  c  d  e  f  g  h\n" + "*\n" + "*  8   a8 b8 c8 d8 e8 f8 g8 h8 \n" + "*  7   a7 b7 c7 d7 e7 f7 g7 h7 \n" + "*  6   a6 b6 c6 d6 e6 f6 g6 h6 \n" + "*  5   a5 b5 c5 d5 e5 f5 g5 h5 \n" + "*  4   a4 b4 c4 d4 e4 f4 g4 h4 \n" + "*  3   a3 b3 c3 d3 e3 f3 g3 h3 \n" + "*  2   a2 b2 c2 d2 e2 f2 g2 h2 \n" + "*  1   a1 b1 c1 d1 e1 f1 g1 h1 \n")
  }

}
