/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oxlab4;

/**
 *
 * @author minnie
 */
public class Player {
    private char symbol;
    private int winCount, loseCount, drawCount;


    public Player(char symbol) {
        this.symbol = symbol;
    }


     public char getSymbol() {
        return symbol;
    }


    public int getInCount() {
        return winCount;
    }

    public int getLoseCount() {
        return loseCount;
    }

    public int getDrawCount() {
        return drawCount;
    }
    public void win() {
        winCount++;
    }
    public void lose() {
        loseCount++;
    }
    public void draw() {
        drawCount++;
    }
    
    

    
}
