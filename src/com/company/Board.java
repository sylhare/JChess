package com.company;

//import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sylhare on 2017-05-03.
 *
 *
 */
public class Board {
    String delims = "[ _/,-.()]+";

    public ArrayList<ChessPawn> white = new ArrayList<>(); //Pawns of the board
    public ArrayList<ChessPawn> black = new ArrayList<>();

    /**
     * Chess Board:
     *
     *      a  b  c  d  e  f  g  h
     *
     *  8   a8 b8 c8 d8 e8 f8 g8 h8
     *  7   a7 b7 c7 d7 e7 f7 g7 h7
     *  6   a6 b6 c6 d6 e6 f6 g6 h6
     *  5   a5 b5 c5 d5 e5 f5 g5 h5
     *  4   a4 b4 c4 d4 e4 f4 g4 h4
     *  3   a3 b3 c3 d3 e3 f3 g3 h3
     *  2   a2 b2 c2 d2 e2 f2 g2 h2
     *  1   a1 b1 c1 d1 e1 f1 g1 h1
     *
     *
     */
    public static void printChessDemo(){
        System.out.print("*      a  b  c  d  e  f  g  h\n*\n");
        for (int i = 8; i > 0; i-- ) {
            System.out.print("*  " + i + "   ");
            for(String letter : ChessRules.LETTERS){
                System.out.print(letter + i + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static String scanCommand() {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        return command;
    }

    /**
     *
     * Parse the input to look for Chess coordinates
     * A chess coordinate is a letter followed by a number
     *
     * @param input is the text command
     * @return the clean and parsed output with coordinates
     */
    public static ArrayList<String> parse(String input){
        ArrayList<String> output = new ArrayList<>();
        //String[] coordinates = input.toLowerCase().split(ChessRules.DELIMS);
        String[] coordinates = input.toLowerCase().split("[ _|,;-]");

        System.out.println(coordinates[0] + coordinates[1] + coordinates[2]);
        /*
        for(String str : coordinates) {
            if(Character.isLetter(str.charAt(0))&&Character.isDigit(str.charAt(1))){
                output.add(str);
            }
        }*/
        return output;
    }
/*
    private void parsePawn() {
        String text = "I will come and meet you at the woods 123woods and all the woods";

        List<String> tokens = new ArrayList<String>();
        String patternString = "\\b(" + StringUtils.join(ChessRules.Variable.PAWN, "|") + ")\\b";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
*/
}
