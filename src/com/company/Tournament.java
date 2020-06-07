/**
 * step two
 * Main class will be the 'controller'
 * constructor calls number of rounds (numberOfRounds) from bnumber of players.
 * class diagrams are on https://app.lucidchart.com/documents/edit/c6ba51bd-b977-4cbc-9aac-c5cbc4faa1ce/HWEp-vi-RSFO
 */
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tournament {

    /**
     * the 3 vars below can be static as don't need to belong to objects
     */
    static int numberOfRounds;
    static int numberOfPlayers;
    static int currentRound = 1; // first round is always going to be one.

    List<Player> playersList = new ArrayList<Player>();




    /**
     * constructor
     *
     * @param
     */
    public Tournament(int numberOfPlayers) {


//        playerArray = new Player[numberOfPlayers];

        createPlayerListArray(numberOfPlayers);  // todo - move into TheGUI class?

        this.numberOfRounds = calcNumbRounds(this.numberOfPlayers);
//        System.out.println("rounds = " + this.numberOfRounds);

    } // end constructor




    /**
     * populate List (array )of players
     * called from constructor
     * @param numberOfPlayers
     */
    public void createPlayerListArray(int numberOfPlayers) {
        //        create arrayList of Player objects

        for (int i = 0; i < numberOfPlayers; i++) {
//            System.out.println(i);
            int x = i + 1;
            String firstName = "Player" + x;
            String lastName = "Surname" + x;

            this.playersList.add( new Player(firstName, lastName, 0));

        }

        System.out.println(playersList);

    } // end createPlayerArray()


    /**
     * displays plays by looping through playerArray
     * // this should not belong in player class as that needs a single player object
     * which we wouldn't want to instantiate to show all of them.
     *
     */
//    public void displayPlayers() {
//        System.out.println("displayPlayers");
//
//        for (int i = 0; i < this.playersList.size()  ; i++) {
//            System.out.println("Player: " + i + " "  +  playersList.get(i).firstName   + " " + playersList.get(i).lastName +   "\n");
//
//
//
//            ????.mainText.append("Player: " + i + " "  +  playersList.get(i).firstName   + " " + playersList.get(i).lastName +   "\n");
//
//        }

        
//    } // end displayPlayers()

    /**
     * calculate the number of rounds, based on the number of players
     */
    public  int calcNumbRounds(int numberOfPlayers) {


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

