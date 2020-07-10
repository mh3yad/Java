package com.mh3yad;

import java.util.Random;
import java.util.Scanner;

public class ranomdGame {
    public static void main(String[] args) {
        Scanner getInput =new  Scanner(System.in);
        System.out.printf("please Enter your Name: ");
        String username = getInput.next();
        System.out.println("welcome: "+ username + " let's start the game");
        System.out.printf("you should choose a num between 1 and 5 \n");

        Random value = new Random();
        System.out.printf("if you hit exact random num generated  you win: ");
        int count=5;
        int random = value.nextInt(5);
//        System.out.println(random);
        do{
            if(random==getInput.nextInt()){
                System.out.printf("congrats!!!!!");
                break;
            }else {
                System.out.println("failed!! try again u still have " + count + " tries");
                count--;
            }
        }while(count>0);

   }
}
