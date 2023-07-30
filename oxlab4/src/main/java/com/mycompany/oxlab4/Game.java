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
        //printTable();
        //printTurn();
        //inputRowCol();
        if (table.checkWin()) {

        }

    }

    private void printWelcome() {
        System.out.println("----- Welcome to XO Game -----");
    }

}
