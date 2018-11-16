# JChess 

[![Build Status](https://travis-ci.org/sylhare/JChess.svg?branch=master)](https://travis-ci.org/sylhare/JChess)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/894c76e9beda48dba246ce4961b403de)](https://www.codacy.com/app/Sylhare/JChess?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Sylhare/JChess&amp;utm_campaign=Badge_Grade)
[![codecov](https://codecov.io/gh/Sylhare/JChess/branch/master/graph/badge.svg)](https://codecov.io/gh/Sylhare/JChess)

A playable game of chess made in Java. The source for the chess rules is mainly [wikipedia](https://en.wikipedia.org/wiki/Chess).
I wanted to document properly how to play the game to create the program based on that.

## Start the App
Build the project using gradle:
```bash
gradle clean build
```

Checkout for more documentation for the game in [docs](/docs)!

## Query the springboot

To check the springboot, you can use curl:

```bash
curl -vvv -i -X GET localhost:8081
```