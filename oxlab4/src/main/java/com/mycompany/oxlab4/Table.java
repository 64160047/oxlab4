/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oxlab4;

/**
 *
 * @author minnie
 */
public class Table {

    private String[][] table = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    private Player player1, player2, currentPlayer;
    private int row, col;

    public Table(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public String[][] getTable() {
        return table;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean setRowCol(int row, int col) {
        if (table[row - 1][col - 1].equals("-")) {
            table[row - 1][col - 1] = currentPlayer.getSymbol();
            this.row = row;
            this.col = col;
            return true;
        }
        return false;
    }

    public boolean checkWin() {
        if (checkRow() || checkCol() || checkDiagonal()){
            saveWin();
            return true;
        }
        return false;
    }

    private boolean checkRow() {
        for (int j = 0; j < 3; j++) {
            if (!table[row - 1][j].equals(currentPlayer.getSymbol())) {
                return false;
            }
        }
        return true;
    }
    private boolean checkCol() {
        for (int i = 0; i < 3; i++) {
            if (!table[i][col - 1].equals(currentPlayer.getSymbol())) {
                return false;
            }
        }
        return true;

    }
    private boolean checkDiagonal() {
        if (row - 1 == col - 1) {
            for (int i = 0; i < 3; i++) {
                if (!table[i][i].equals(currentPlayer.getSymbol())) {
                    return false;
                }
            }
            return true;
        }
        if ((row + col) - 2 == 2) {
            for (int i = 0; i < 3; i++) {
                if (!table[i][table.length - 1 - i].equals(currentPlayer.getSymbol())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    


   

    private void saveWin() {
        if (currentPlayer == player1) {
            player1.win();
            player2.lose();
        } else {
            player2.win();
            player1.lose();
        }
    }

}


