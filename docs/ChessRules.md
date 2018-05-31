## Chess Rules

### Generic Chess Rules

- White always starts first.
- King can't move to a "check" case.
	- If King can't move it's "checkmate". 

#### Castling


Castling is when King goes to the available case of its color before an untouched Rook. When castling, the Rook jumping over the King next to it.

#### Pawn promotion

A pawn becomes Queen if they reach the other hand of the board.

#### En passant
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
	- Ngf3 : Indicate the letter (referred as *file*) of the source case (knight in g to f3).
	- N5f3 : If not enough, use the number (referred as *rank*) of the souce case (knight in 5 to f3)
	- Qd5f3 : If the above is not enough (when with multiple pawn promotion for example: Queen in d5 to f3)
	- The capture indication should be placed in between the coordinates
- **Pawn Promotion**
	- e8Q or e8=Q : Pawn moved to e8 and got promoted to Queen 
- **Draw offer** *Not part of the Notation*
	- (=) : Submitting a draw offer to the oponent 
- **Castling**
	- 0-0 : Means castling toward the king side
	- 0-0-0 : Means castling toward the Queen side
- **Check**
	- † or + : to indicate the opponent's king is in check
- **Checkmate**
	- ‡ or # or ≠ : to indicate chekmate
- **End of game**
	- 1-0 : the white side won
	- 0-1 : the black side won
	- ½–½ : it's a draw

### Simplified Notation
It's a home made simplified notation that I'll detail here. Here is how it works:

- **Movements**
- Pawn's type: position -> destination comments 
- Pawn's type: position destination comments

The comments/action can be a castling (king or queen side), indicating a check or a checkmate (that will need to be confirmed), offer a draw. 
