/**
 * step two
 * Main class will be the 'controller'
 * constructor calls number of rounds (numberOfRounds) from bnumber of players.
 * class diagrams are on https://app.lucidchart.com/documents/edit/c6ba51bd-b977-4cbc-9aac-c5cbc4faa1ce/HWEp-vi-RSFO
 */
package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tournament {

    int numberOfRounds;
    int numberOfPlayers;
    int currentRound = 1; // first round is always going to be one.
    Player playerArray[]; // holds array of players.  //todo remove this

    List<Player> playersList = new ArrayList<Player>();




    /**
     * constructor
     *
     * @param numberOfPlayers
     */
    public Tournament(int numberOfPlayers) {
        this.numberOfRounds = numberOfRounds;
        this.numberOfPlayers = numberOfPlayers;

        playerArray = new Player[numberOfPlayers];
        createPlayerArray(numberOfPlayers);

        this.numberOfRounds = calcNumbRounds(this.numberOfPlayers);
//        System.out.println("rounds = " + this.numberOfRounds);
    }

    /**
     * populate List (array )of players
     * called from constructor
     * @param numberOfPlayers
     */
    public void createPlayerArray(int numberOfPlayers) {
        //        create arrayList of Player objects

        for (int i = 0; i < numberOfPlayers; i++) {
//            System.out.println(i);
            int x = i + 1;
            String firstName = "Player" + x;
            String lastName = "Surname" + x;

            playersList.add( new Player(firstName, lastName, 0));

        }

        System.out.println(playersList);

    } // end createPlayerArray()


    /**
     * displays plays by looping through playerArray
     * // this should not belong in player class as that needs a single player object
     * which we wouldn't want to instantiate to show all of them.
     */
    public void displayPlayers() {
        System.out.println("displayPlayers");

        for (int i = 0; i < this.playersList.size()  ; i++) {
            System.out.println("Player: " + i + " " + this.playersList.toString());
            
        }

        
    } // end displayPlayers()

    /**
     * calculate the number of rounds, based on the number of players
     */
    public static int calcNumbRounds(int numberOfPlayers) {


        return (int) (Math.log(numberOfPlayers) / Math.log(2));


    }




} // class

