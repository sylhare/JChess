package com.company;

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
*/
public class Main {

    public static void main(String[] args) {

        /*
        List<List<String>> l = new ArrayList<>();
        l.add(new ArrayList<>());
        l.get(0).add("a");
        l.get(0).add("b");

        System.out.println(l.get(0).get(1));

        String str = "";
        String words[] = str.split("");
        */

        Board b = new Board();
        System.out.println(b.parse("test,a2;b4 finish"));

        System.out.println(Board.isCoordinate("00"));

        if ('8' < '1'){
            System.out.print("SUCCESS");
        }

        Board.printChessDemo();
        System.out.println(ChessRules.Variable.getAllNames());

    }
}
