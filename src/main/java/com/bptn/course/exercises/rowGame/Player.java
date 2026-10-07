package com.bptn.course.exercises.rowGame;

/**
 The player class is concerned with descibing a player and things that relate to it. It keeps track of the name of a player, the order of the player in relation to other players in the game, and the move the player may want to make (which is just as simple as the user picking which column of the board they want their token to be dropped in). This class could also have logic to create only valid users. E.g. the playerNumber should not be greater than 4 based on the specification we've received.
 */

import java.util.Scanner;
public class Player {

    private String name;
    // Add other instance variable(s)
    private String playerNumber;

    // Question: should scanner be static or not?
    // Yes the scanner should be static, so a new scanner is not created with every instance
    private static Scanner scanner = new Scanner(System.in);// complete line

    public Player(String name, String playerNumber) {
        // complete constructor
        this.name = name;
        this.playerNumber = playerNumber;
    }

    // create getter methods

    public int makeMove() {
        System.out.println("Make your move. What column do you want to put a token in?");
        int column = scanner.nextInt();   // receive user input
        return column;
    }

    public String toString() {
        return ("Player " + playerNumber + " is " + name);
    }

    public String getName(){ return name; }
    public String getPlayerNumber(){ return playerNumber; }


}