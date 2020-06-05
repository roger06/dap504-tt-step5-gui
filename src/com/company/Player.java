package com.company;


import java.util.Random;

public class Player {

    public  String firstName, lastName;
    public int age = 0;


    public Player(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    /**
     * show details of a particular player
     */
    public void showPlayerDetails(){
        System.out.println("this will show a player's details");
    }


    /**
     * mainly for debugging
     * @return
     */
    @Override
    public String toString() {
        return  firstName + " " +
                lastName + '\'' +
                age;
    }

    /**
     * for testing (JUnit)
     */
    public String returnPlayerName(){

        return this.firstName + " " + this.lastName;
    }



}
