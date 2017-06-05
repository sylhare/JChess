package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Sylhare on 2017-05-10.
 */
public class ChessRules {
    static String[] LETTERS = {"a", "b", "c", "d", "e", "f", "g", "h"};
    static String DELIMS = "[^a-h1-8]";

    /**
     * Variable enum in the ChessRules class
     * Have all the information of the used pawns (King, Queen, Rook, ...)
     * Their values and the possible name they can be called to
     *
     */
    public enum Variable{
        KING(1000, new String[]{"king", "roi", "k"}),
        QUEEN(9, new String[]{"queen", "dame", "q"}),
        BISHOP(5, new String[]{"bishop", "fou", "b"}),
        KNIGHT(3, new String[]{"knight", "cavalier", "n", "kt"}),
        ROOK(3, new String[]{"rook", "tour", "r"}),
        PAWN(1, new String[]{"pawn", "pion", "p", ""});

        private final int value;
        private final String[] names;
        private static ChessRules.Variable[] variables = ChessRules.Variable.class.getEnumConstants();

        /**
         * Constructor of the Variable Enum
         *
         * @param i the value of the chess pawn
         * @param strArr the name of the chess pawn
         */
        Variable(int i, String[] strArr) {
            value = i;
            names = strArr;
        }

        /**
         * Get the value of the pawn
         *
         * @return value
         */
        public int getValue() {
            return value;
        }

        /**
         * Get the possible names of the chess pawn
         * @return
         */
        public String[] getNames() {
            return names;
        }

        /**
         * Get the name of the chess pawn
         * @return human readable name
         */
        public String getName(){
            return names[0];
        }

        /**
         * Public static function to get all names
         * of the Variable enum in ChessRules
         *
         *@return all names in an ArrayList<String>
         */
        public static ArrayList<String> getAllNames() {
            ArrayList<String> allNames = new ArrayList<>();
            for (ChessRules.Variable var : variables) {
                Collections.addAll(allNames, var.getNames());
            }
            return allNames;
        }

        /**
         * Give the enumConstant based on the input name
         *
         * @param name
         * @return enumConstant
         */
        public static Variable getEnumConstantFromName(String name){
            Variable enumConstant = null;
            for (ChessRules.Variable var : variables) {
                if(Arrays.asList(var).contains(name)){
                    enumConstant = var;
                }
            }
            return enumConstant;
        }
    }
}
