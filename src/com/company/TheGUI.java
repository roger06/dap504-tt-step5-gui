package com.company;

import javax.swing.*;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.SwingWorker;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * class responsible for creating / managing GUI
 * other classes much do the business logic
 * this class will display were appropriate.
 */
public class TheGUI implements ActionListener {
    public JPanel jPanel;
    private JLabel topLabel;
    private JScrollPane mailScroll;
    public JTextArea mainText;
    public JButton runBtn;

    private JButton exitBtn;
    private JButton displayPlayersBtn;
    private JProgressBar progressBar;
    private JButton btnProgress;
    private JButton btnProgressButton;
    static int progress = 0;

    List<Player> playersList = new ArrayList<Player>();

    Tournament theTournament;   // Tournament object available to the theGUI class

    public TheGUI(int numberOfPlayers) {

        Tournament theTournament = new Tournament(Main.numberOfPlayers);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("theGUI");
                frame.setContentPane(jPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.pack();
                frame.setSize(900, 400);
                frame.setVisible(true);
                System.out.println("Thread from constructor = " + Thread.currentThread().getName());

               JProgressBar btnProgressButton = new JProgressBar(0,16);
            }
        });



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

                mainText.append("this is a manually added string.\n");


                System.out.println("Thread in displayPlayers (before loop) " + Thread.currentThread().getName());

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        int sleep = 300;
                        progressBar.setMinimum(0);
                        progressBar.setMaximum(15);

                        updateProgessBarInBackground loading = new updateProgessBarInBackground();
                        loading.execute();


//                        updateProgressBar();
                    }
                });




            }
        });





    } // end constructor

    public void updateProgressBar() {

        System.out.println("updateProgressBar fn called");
        int sleep = 300;
        int numPlayers = 16;

        for (int i = 1; i < numPlayers; i++) {


//           System.out.println("Player: " + i + " "  +  theTournament.playersList.get(i).firstName   + " " + theTournament.playersList.get(i).lastName );
            System.out.println("Player " + i);
//                            mainText.append("Player: " + i + " "  +  theTournament.playersList.get(i).firstName   + " " + theTournament.playersList.get(i).lastName +   "\n");

            try {
                sleep(sleep);
//                                System.out.println("zzzzzzzzzzzzzzzz");
//                                sleep is working - it will delay sout - but must be on the wrong thread for the GUI.#
                System.out.println(Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Sleep failed.");
            }

            progressBar.setValue(progress);
//                            progressBar.repaint();
            System.out.println("Progress =  " + progress);

            System.out.println("Value of progress bar is " + progressBar.getValue());
            // getting the value FROM the bar (not just the loop) implies it is being set - it is just not being displayed!!!!!!
            progressBar.repaint();
            progress++;


        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("action performed");
        System.out.println(actionEvent.getSource());
    }

    public class updateProgessBarInBackground extends SwingWorker<Void, Void>{

        @Override
        protected Void doInBackground() throws Exception {
            // TODO Auto-generated method stub
            updateProgressBar();

            System.out.println("do in bg");
            return null;
        }


    }
}



