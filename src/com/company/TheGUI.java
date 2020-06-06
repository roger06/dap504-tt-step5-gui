package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheGUI  {
    public JPanel jPanel;
    private JLabel topLabel;
    private JScrollPane mailScroll;
    public JTextArea mainText;
    public JButton runBtn;

    private JButton exitBtn;
    private JButton displayPlayersBtn;

    public TheGUI(Tournament theTournament) {


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

//                Tournament.displayPlayers(new TheGUI(theTournament) );
                System.out.println("display players button clicked");


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
