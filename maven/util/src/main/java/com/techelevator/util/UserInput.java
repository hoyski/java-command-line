package com.techelevator.util;

import java.util.Scanner;

public class UserInput {
    public static int getIntegerFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a whole number: ");
        String numStr = input.nextLine();
        return Integer.parseInt(numStr);
    }
}
