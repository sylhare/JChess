# JChess 

A playable game of chess made in Java. The source for the chess rules is mainly [wikipedia](https://en.wikipedia.org/wiki/Chess).
I wanted to document properly how to play the game to create the program based on that.

## Chess Rules

### Generic Chess Rules

- White always starts first.
- King can't move to a "check" case.
	- If King can't move it's "checkmate". 

#### Castling


Castling is when King goes to the available case of its color before an untouched Rook. When castling, the Rook jumping over the King next to it.

#### Pawn promotion

A pawn becomes Queen if they reach the other hand of the board.

### En passant
Pawn can advance two cases when first move.

*En passant* is a way to capture a pawn right after it mades its two cases move, going diagonal behind it with another pawn.

![](https://upload.wikimedia.org/wikipedia/commons/0/09/Ajedrez_animaci%C3%B3n_en_passant.gif)

## Notation
### Algebraic Notation
It's the [method](https://en.wikipedia.org/wiki/Algebraic_notation_(chess)) for recording and describing the moves in a game of chess.
The program will understand the moves and play them.

I will put here the main characteristics that will be used by the program

- **Movements**
	- Be5 : move Bishop to e5
	- c5 : move pawn to c5
- **Captures**
	- Bxe5 or B:e5 or Be5: : Bishop capture the piece on e5
	- exd6e.p. : pawn in e capturing another pawn *en passant* resulting in it going to d6.
- **Disambiguating moves**
	- 
- **Pawn Promotion**
- **Draw offer**
- **Castling**
- **Check**
- **Checkmate**
- **End of game**

### Simplified Notation
It's a home made simplified notation that I'll detail here. Here is how it works:

- Piece: position -> destination comments 
- Piece position destination comments

The comments/action can be a castling, indicating a check or a checkmate (that will need to be confirmed), offer a draw. 


## Documentation

### Parsing

#### Regex
The Java api documentation have a lot of great example to better understand what you can do with Regex

- [Class Pattern (use Regex)](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum)

Some Regex used for the project:

```java
[ _|,;>-] //All character between the brackets will be removed
[^a-h1-8] //Everything but letter from a to h or numbers from 1 to 8
```

#### Split

The split fonction `string.split(regex)` splits a string into multiple elements. here is a great read on it.
- [How to split a string](https://www.mkyong.com/java/java-how-to-split-a-string/)

It will be used to parse the Chess commands.

#### Trim
The trim function `string.toTrim()` removes all the spaces of a string.

- [How to trim()](https://www.tutorialspoint.com/java/java_string_trim.htm)

Here is a custom trim.

```java
/**
 * custom trim to remove every , or ;
 */
function trimStr(str) {
  return str.replace(",;",'');
}
```



