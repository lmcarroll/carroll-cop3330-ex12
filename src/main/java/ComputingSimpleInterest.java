/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class ComputingSimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter the principal: ");
        Scanner input = new Scanner(System.in);
        float principal = input.nextFloat();

        System.out.println("Enter the rate of interest: ");
        input = new Scanner(System.in);
        float interest = input.nextFloat();

        System.out.println("Enter the number of years: ");
        input = new Scanner(System.in);
        float years = input.nextFloat();

        float amount = principal * (1 + (interest / 100 * years));

        System.out.printf("After %.0f years at %.1f%%, the investment will be worth $%.0f.", years, interest, amount);
    }
}
