package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * when round is over update theTournament.currentRoundNumber
 * Round class receives a Tournament object (theTournament) for its constructor
 * Object created in Main main()
 */

public class Round {

    Tournament theTournament;

    List<Player> drawA = new ArrayList<Player>();
    List<Player> drawB = new ArrayList<Player>();

    /**
     * constructor
     *
     */
    public Round(Tournament theTournament) {
      this.theTournament = theTournament;

    }

    public Round() {

    }

    //    test method
    public void showInfoInRound(){
        System.out.println();
        System.out.println("In round we have~: ");
        System.out.println("Players : " + theTournament.numberOfPlayers);
        System.out.println("Rounds : " +theTournament.numberOfRounds);
        System.out.println("Current round : " + theTournament.currentRound);
        System.out.println();
    }

    /**
     * called by Main.Main()
     * @throws Exception
     */
    public void playRound(TheGUI theGUI) throws Exception {
        // to do - some error checking here about content in drawA and drawB

         createDraws();  // generates the 2 draw listarrays


        // check draws are the same length
        if(drawA.size() != drawB.size()) {

            // custom exception~?
            throw (new Exception("Draw arrays do not match!"));

        }


        int drawLength = drawA.size();

        for (int pairing = 0; pairing < drawLength; pairing++) {
            Utils.printDividerHdr();

            Match theMatch = new Match(drawA.get(pairing), drawB.get(pairing));

//            int indexToDelete =     theMatch.playMatch()

// remove the index of the losing player from the main player List?
            System.out.println("the index is "+drawA.indexOf(drawA.get(pairing)));


            System.out.println("Pairing will be : " + drawA.get(pairing).lastName +
                    " vs " + drawB.get(pairing).lastName);

            theGUI.mainText.append("Pairing will be : " + drawA.get(pairing).lastName +
                    " vs " + drawB.get(pairing).lastName + "\n");


//            System.out.println("best of enum = "+ Constants.BESTOFGAMES.getNumber());
            Utils.printDividerFtr();
        }








    } // end playRound()

    /**
     * Populates class arrayLists - drawA and drawB
     */
    public  void createDraws(){

        // createDraws()
        Utils.printDividerHdr();

        System.out.println("******************************** Current round : " +theTournament.currentRound + " ******************************");
        System.out.println();

        for (int i = 0; i < theTournament.playersList.size()  ; i++) {

//            drawA.add(theTournament.playersList.get(i));

            if (i % 2 == 0) {
                this.drawA.add(theTournament.playersList.get(i));
                System.out.println("Draw A - : " +  theTournament.playersList.get(i).toString());
            }
            else{
                this.drawB.add(theTournament.playersList.get(i));
                System.out.println("Draw B- : " +  theTournament.playersList.get(i).toString());

            }



        } // end for

        Utils.printDividerFtr();
        System.out.println(drawA);
        System.out.println(drawB);

    }


} // end class
