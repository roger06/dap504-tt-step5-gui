package com.company;

import javax.swing.*;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;


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
    private JLabel progressLabel;
    static int progress = 0;

    List<Player> playersList = new ArrayList<Player>();

    Tournament theTournament = new Tournament(Main.numberOfPlayers);

    public TheGUI(int numberOfPlayers) {


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

               JProgressBar btnProgressButton = new JProgressBar(1,15);
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

                System.out.println("Thread in displayPlayers (before loop) " + Thread.currentThread().getName());

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        int sleep = 300;
                        progressBar.setMinimum(0);
                        progressBar.setMaximum(15);

                        updateProgBarInBackground loading = new updateProgBarInBackground();
                        loading.execute();


                    }
                });

            }
        });





    } // end constructor

    public void updateProgressBar() {

        System.out.println("updateProgressBar fn called");
        int sleep = 300;
        int numPlayers = 16;
        String playerName = "";

        try {
            System.out.println("players list len = " +  theTournament.playersList.size() );
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Something failed here");
        }


        for (int i = 0; i <= numPlayers; i++) {

            playerName = theTournament.playersList.get(i).firstName + " " + theTournament.playersList.get(i).lastName;


//           System.out.println("Player: " + i + " "  +  theTournament.playersList.get(i).firstName   + " " + theTournament.playersList.get(i).lastName );
            System.out.println("Player " + i);
//                            mainText.append("Player: " + i + " "  +  theTournament.playersList.get(i).firstName   + " " + theTournament.playersList.get(i).lastName +   "\n");
            mainText.append("Player : " + playerName +"\n");
            try {
                sleep(sleep);

                // sleep is working - it will delay sout - but must be on the wrong thread for the GUI.#
               // System.out.println(Thread.currentThread().getName());

            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Sleep failed.");
            }

            progressBar.setValue(progress);
            
            progressLabel.setText(Integer.toString(progress+1));
//                            progressBar.repaint();
            System.out.println("Progress =  " + progress);

            // System.out.println("Value of progress bar is " + progressBar.getValue());
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

    //    TODO - why does this have to be a new class? Why isn't it a problem to have it in the same file?
//    what if it was moved to another file?


    public class updateProgBarInBackground extends SwingWorker<Void, Void>{
        @Override
        protected void done() {
            super.done();

        }

        @Override
        protected Void doInBackground() throws Exception {
            // TODO Auto-generated method stub
            updateProgressBar();

            System.out.println("do in bg");
            return null;
        }


    }
} // end class TheGUI



