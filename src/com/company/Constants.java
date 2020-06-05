package com.company;

/**
 * CONSTANTS here as enums.
 */
public enum Constants {

    /**
     * CONSTANTS
     */
    BESTOFGAMES(5),
    POINTSTOWIN(11),
    MAXPOINTSPERGAME(15);

    private int number;

    Constants(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


}
