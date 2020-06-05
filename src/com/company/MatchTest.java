package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    @org.junit.jupiter.api.Test
    void playMatch() {
        System.out.println("testing Match");
        

    }

    @Test
    public void test(){

        Player testPlayer = new Player("Test", "Player",42);
        String result = testPlayer.returnPlayerName();

        assertEquals("Test Player", result);
    } @Test
    public void anotherTest(){

        Player testPlayer = new Player("Test", "Player",42);
        String result = testPlayer.returnPlayerName();

        assertEquals("Test Player", result);
    }

}