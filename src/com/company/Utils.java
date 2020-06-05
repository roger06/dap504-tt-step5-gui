package com.company;

import java.util.Random;

/**
 * various utility methods such as printing out dividers etc.
 *
 */
public class Utils {

    public static void printDividerHdr(){

        System.out.println();
        System.out.println("*********************************************************************************");

    }

    public static void printDividerFtr(){
        System.out.println();
        System.out.println("*********************************************************************************");
        System.out.println();
    }

    public static int getRandomNumber(int from, int to){
        Random random = new Random();
        int randNum = 1 + random.nextInt(1000);

        return randNum;
    }
}
