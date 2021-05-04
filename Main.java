package com.ibrobk.guessgame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Wonderland!");
        System.out.println("May I have your Name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello "+name);

        System.out.println("Shall we begin?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int beginAnswer = scanner.nextInt();

        //Creating a while loop to check user answer
        while(beginAnswer != 1){
            System.out.println("Shall we begin?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");

            beginAnswer = scanner.nextInt();
        }
        //Generating Random Number from 0-20.
        Random random = new Random();
        int x = random.nextInt(20)+1;

        //Asking a user to guess a number
        System.out.println("Please guess a Number from 0 to 20.");
        int userInput = scanner.nextInt();

        //Creating other variables to be used in the game
        int timeTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        // checking whether user has finished
        while(!shouldFinish){
            timeTried++;

            if (timeTried<5){

                if (userInput == x){
                    hasWon = true;
                    shouldFinish = true;
                }else if(userInput>x){
                    System.out.println("Please Guess Lower");
                    userInput = scanner.nextInt();
                }else{
                    System.out.println("Please Guess Higher");
                    userInput = scanner.nextInt();
                }

            }else{
                shouldFinish = true;
            }
        }
        if (hasWon){
            System.out.println("Congratulations! you guessed correct.\n Your total number of guess is "+timeTried);
        }else{
            System.out.println("Game Over!");
            System.out.println("The Number was: "+x);
        }


    }
}
