package com.company;

import java.util.Random;

/**
 * Match class executes a match between two playes
 */
public class Match  {

    Player player1, player2;   // players for each match


    public Match(Player player1, Player player2) {
        // todo - error check we have two (different) Player objects

        this.player1 = player1;
        this.player2 = player2;


    }  // end constructor


    /**
     * returns one of two players as winner.
     * @return
     */
    public  Player playMatch() {

        // need a random number generator
        // random number 1 - 1000, if odd player1 wins, if even player2 wins



        if ( Utils.getRandomNumber(1,1000) % 2 == 1 ) {

            System.out.println("Player 1 has won - they are: " + player1.hashCode());
            return this.player1;


        }
        else {
            return this.player2;
        }
    }


} // class Match
