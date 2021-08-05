package com.stage1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 1;
        while(choice != 0) {
            System.out.println();
            System.out.println("Enter 1 for task 1\n" + "Enter 2 for task 2\n" + "Enter 3 for task 3\n" +
                    "Enter 4 for task 4\n" + "Enter 5 for task 5\n" + "Enter 6 for task 6\n" + "Enter 0 to exit");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.println("Two arguments is true: " + TaskSolving.checkStatement(true, false, true, false));
                    break;
                case 2:
                    System.out.println("Result of flipBit method: " + TaskSolving.flipBit(34, 5));
                    break;
                case 3:
                    System.out.println("Count of leap years: " + TaskSolving.countLeap(100));
                    break;
                case 4:
                    System.out.println("Result symbol from slash: " + TaskSolving.distanceToSlash(32));
                    break;
                case 5:
                    System.out.println("Is two grade: " + TaskSolving.isTwoGrade(-8));
                    break;
                case 6:
                    System.out.println("Is palindrome: " + TaskSolving.isPalindrome("Madam, I'm Adam!"));
                    break;
            }
        }
    }
}
