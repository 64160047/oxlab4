/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oxlab4;
import java.util.Scanner;

/**
 *
 * @author minnie
 */
public class Game {

    private Player player1, player2;
    private Table table = new Table(player1, player2);
    private String continute;
    private boolean isFinish = false;
    private String[][] t = table.getTable();

    public Game() {
        player1 = new Player("X");
        player2 = new Player("O");
        table = new Table(player1, player2);
    }

    public void play() {
        printWelcome();
        newGame();
        while (!isFinish) {
            t = table.getTable();
            printTable();
            printTurn();
            if (inputRowCol()) {

                if (table.checkWin()) {
                    printTable();
                    printWinner();
                    printPlayer();
                    inputContinute();
                    table.resetTable();
                    t = table.getTable();
                }
                if (table.checkDraw()) {
                    printTable();
                    printDraw();
                    printPlayer();
                    inputContinute();
                    table.resetTable();
                    t = table.getTable();
                }
                table.switchPlayer();
            }

        }

    }

    private void printWelcome() {
        System.out.println("WELCOME OX GAME 👀");
    }

    private void printTable() {
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

    private boolean inputRowCol() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input row ,column (1-3) ➤ : ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        return table.setRowCol(row, col);
    }

    private void newGame() {
        table = new Table(player1, player2);
    }

    private void printWinner() {
        System.out.println(" ----- Congratulations ----- ");
        System.out.println(" Who the winner 🏆  is  " + table.getCurrentPlayer().getSymbol());
        System.out.println("---------------------------");

    }

    private void printDraw() {
        System.out.println(" Game over 😈 ");
        System.out.println("  -----    Draw   -----  ");
        System.out.println("---------------------------");
    }

    private void printPlayer() {
        System.out.println(player1);
        System.out.println(player2);

    }

    private void inputContinute() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do You want to play again (Y/N) 🚪 ➤  ");
        continute = sc.next();
        while (!continute.toLowerCase().equals("n") && !continute.toLowerCase().equals("y")) {
            System.out.print("Do You want to play again (Y/N) 🚪 ➤  ");
            continute = sc.next().toLowerCase();

        }
        if (continute.toLowerCase().equals("n")) {
            isFinish = true;
            System.out.println(" ----- See yaaa 💖 ----- ");
        }
    }

}

