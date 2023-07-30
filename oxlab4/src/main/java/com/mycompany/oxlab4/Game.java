/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oxlab4;

/**
 *
 * @author minnie
 */
public class Game {
    private Table table;
    private Player player1, player2;

    public Game() {
        player1 = new Player("X");
        player2 = new Player("O");
    }

    public void play() {
        printWelcome();
        printTable();
        printTurn();
        //inputRowCol();
        if (table.checkWin()) {
            System.out.println("WELCOME OX GAME 👀");

        }

    }

    private void printWelcome() {
        System.out.println("WELCOME OX GAME 👀");
    }
     private void printTable() {
        String[][] t = table.getTable();
        System.out.println(" ⎯⎯⎯⎯⎯⎯⎯ ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + t[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ⎯⎯⎯⎯⎯⎯⎯ ");

    }
     private void printTurn() {
        System.out.println("Now ➤ " + table.getCurrentPlayer().getSymbol() + " turn");
    }



}
