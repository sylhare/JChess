package com.github.sylhare;

public class ChessBoard {

    /**
     * Print the default chess coordinates
     */
    public static String printChessCoordinates(){
        String coordinates = "* Chess ChessBoard:\n*\n*      a  b  c  d  e  f  g  h\n*\n";
        for (int i = 8; i > 0; i-- ) {
            coordinates += "*  " + i + "   ";
            for(String letter : ChessRules.LETTERS.getLetters()){
                coordinates += letter + i + " ";
            }
            coordinates += "\n";
        }
        System.out.println(coordinates);
        return coordinates;
    }

    public String CheckBoard(){
        return ChessBoard.printChessCoordinates();
    }
}