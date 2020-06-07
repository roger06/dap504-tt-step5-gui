package com.company;

/**
 * this class plays point by point in a game.
 */

public class PlayPoint {
    int rounds;

    public PlayPoint(int rounds) {
        this.rounds = rounds;
    }

    /**
     *
     * method pairs players together and plays shots etc.
     * gets player objects from  @link Tournament
     *
     * {@link Tournament#createPlayerListArray(int)}
     *
     * <p>we can get the current round from  {@link Tournament#numberOfRounds}</p>
     *
     * @param player1   (this is the next player in the A draw)
     * @param player  (this is the next player in the B draw)
     * @param round  round number to keep a track of ...
     * @param tournName  the name of the tournament.
     */
    public void playPoint (Player player1, Player player, int round, String tournName) {


    }


}



