package com.company;

import javax.swing.*;

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
     * @param args
     */
    public static void main(String[] args) throws Exception {

        int numberOfPlayers = 8;

        Tournament theTournament = new Tournament(numberOfPlayers); // todo - change input into constructor so user can select no. of players.

        theTournament.displayPlayers();


        /**
         * this is the main controller that loops thru each round
         * todo - should this be in Tournament class?
         */
        for (theTournament.currentRound = 1; theTournament.currentRound <= theTournament.numberOfRounds; theTournament.currentRound++) {

            Round currentRound = new Round(theTournament);
//            currentRound.showInfoInRound();
            TheGUI theGUI = new TheGUI();




            JFrame frame = new JFrame("theGUI");
            frame.setContentPane(theGUI.jPanel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setSize(400, 400);

            frame.setVisible(true);

            currentRound.playRound(theGUI);

            theGUI.mainText.append("this is a string.");




        } // end main()






    } // end main()




}
