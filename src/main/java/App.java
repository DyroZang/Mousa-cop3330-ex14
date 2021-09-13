/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the order amount?");
        double amount = Double.parseDouble(input.nextLine());

        System.out.println("What is the state?");
        String state = input.nextLine();



        if(state.equals("WI")){
            double tax = 0.055;
            System.out.format("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", amount, tax*amount, amount+(amount*tax));
            System.exit(0);
        }
        System.out.format("The total is $%.2f", amount);
    }
}