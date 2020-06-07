package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * class responsible for creating / managing GUI
 * other classes much do the business logic
 * this class will display were appropriate.
 */
public class TheGUI  {
    public JPanel jPanel;
    private JLabel topLabel;
    private JScrollPane mailScroll;
    public JTextArea mainText;
    public JButton runBtn;

    private JButton exitBtn;
    private JButton displayPlayersBtn;

    List<Player> playersList = new ArrayList<Player>();

    Tournament theTournament;   // Tournament object available to the theGUI class

    public TheGUI(int numberOfPlayers) {

        Tournament theTournament = new Tournament(Main.numberOfPlayers);

        JFrame frame = new JFrame("theGUI");
        frame.setContentPane(this.jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setSize(900, 400);
        frame.setVisible(true);

        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);

            }
        });


//      display Players button clicked - runs  Tournament.displayPlayers
        displayPlayersBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                System.out.println("display players button clicked");


                for (int i = 0; i < theTournament.playersList.size(); i++) {

                    System.out.println("Player: " + i + " "  +  theTournament.playersList.get(i).firstName   + " " + theTournament.playersList.get(i).lastName );


//            theGUI.mainText.append("Player: " + i + " " + this.playersList.toString()+"\n");

                mainText.append("Player: " + i + " "  +  theTournament.playersList.get(i).firstName   + " " + theTournament.playersList.get(i).lastName +   "\n");

                }


//
//                mainText.append( "Size = "  + theTournament.playersList.size());
//                mainText.append(theTournament.playersList.get(0).lastName);
//                mainText.append("test");




            }
        });


        // run button is clicked
        runBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                System.out.println("run button clicked.");
                try {
//                    playRound(this);
                    Tournament.runTournamentRounds();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    } // end constructor

}
