package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * step 5
 * add GUI
 *
 *
 */

public class Main {

    /**
     * main method - kicks everything off
     * but doesn't control tournament
     *
     * creates TheGUI theGUI  - the main GUI object (which creates  Tournament theTournament - the main tournament object)
     *
     * @param args
     */

    // todo - change input into constructor so user can select no. of players.
    static  int numberOfPlayers = 16;

    public static void main(String[] args) throws Exception {


        // create the ListArray of player objects
//        theTournament.createPlayerArray(numberOfPlayers);

        // create GUI.
        //todo - is it better to do this another way?
        // todo - not sure we even need the var - could just do -  new TheGUI(numberOfPlayers); ??
        TheGUI theGUI = new TheGUI(numberOfPlayers);


        // show all the players we have in the tournament.
//        todo - this will need to be called from GUI class
//        theTournament.displayPlayers();

        // run the tournament
        // this has the for loop for each round.

        // todo the method below needs to be called when the run button is clicked.

//        theTournament.runTournamentRounds();



    } // end main()



}
