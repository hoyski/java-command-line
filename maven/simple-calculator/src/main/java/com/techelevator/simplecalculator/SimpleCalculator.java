package com.techelevator.simplecalculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.run();
    }

    public void run() {
        int num1 = getIntegerFromUser();
        int num2 = getIntegerFromUser();
        int result = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }

    public int getIntegerFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a whole number: ");
        String numStr = input.nextLine();
        return Integer.parseInt(numStr);
    }
}
