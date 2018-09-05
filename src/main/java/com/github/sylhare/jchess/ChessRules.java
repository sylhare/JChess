package com.github.sylhare.jchess;

/**
 * ChessRules enum
 */
public enum ChessRules {
    LETTERS("a", "b", "c", "d", "e", "f", "g", "h");

    private final String[] letters;

    ChessRules(String... ChessBoardLetters) {
        letters = ChessBoardLetters;
    }

    public String[] getLetters(){
        return letters;
    }
}
