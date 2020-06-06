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

    /**
     * the 3 vars below can be static as don't need to belong to objects
     */
    static int numberOfRounds;
    static int numberOfPlayers;
    static int currentRound = 1; // first round is always going to be one.
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
//        createPlayerArray(numberOfPlayers);

        this.numberOfRounds = calcNumbRounds(this.numberOfPlayers);
//        System.out.println("rounds = " + this.numberOfRounds);

    } // end constructor




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
     * @param theGUI
     */
    public void displayPlayers(TheGUI theGUI) {
        System.out.println("displayPlayers");

        for (int i = 0; i < this.playersList.size()  ; i++) {
            System.out.println("Player: " + i + " "  +  playersList.get(i).firstName   + " " + playersList.get(i).lastName +   "\n");


//            theGUI.mainText.append("Player: " + i + " " + this.playersList.toString()+"\n");

            theGUI.mainText.append("Player: " + i + " "  +  playersList.get(i).firstName   + " " + playersList.get(i).lastName +   "\n");

        }

        
    } // end displayPlayers()

    /**
     * calculate the number of rounds, based on the number of players
     */
    public static int calcNumbRounds(int numberOfPlayers) {


        return (int) (Math.log(numberOfPlayers) / Math.log(2));


    }



    public static   void runTournamentRounds() {
        /**
         * this is the main controller that loops thru each round
         * todo - should this static? what wuold be the pros and cons
         * pros won't need to create an object in the theGUI obj
         * cons - will we be able to access the data we need?
         */
        for (currentRound = 1; currentRound <= numberOfRounds; currentRound++) {

//            Round currentRound = new Round(theTournament);
            Round currentRound = new Round();

            currentRound.showInfoInRound();

        } // end for
    }



} // class

