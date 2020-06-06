package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * step 4
 * send player objects from each round to a match
 *
 * Match class added
 * Constants Enum class added.
 *
 *
 */

public class Main {

    /**
     * main method - kicks everything off
     * creates  Tournament theTournament - the main tournament object
     * creates TheGUI theGUI  - the main GUI object
     * @param args
     */
    public static void main(String[] args) throws Exception {

            int numberOfPlayers = 16;

        // set up main objects
        Tournament theTournament = new Tournament(numberOfPlayers); // todo - change input into constructor so user can select no. of players.

        // create the ListArray of player objects
        theTournament.createPlayerArray(numberOfPlayers);

        // create GUI and pass theTournament object.
        //todo - is it better to do this another way?
        TheGUI theGUI = new TheGUI(theTournament);


        // show all the players we have in the tournament.
//        todo - this is only to be run with the display players button is clicked.
        theTournament.displayPlayers(theGUI);

        // run the tournament
        // this has the for loop for each round.

        // todo the method below needs to be called when the run button is clicked.

//        theTournament.runTournamentRounds();



    } // end main()



}
