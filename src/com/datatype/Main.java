package com.datatype;

import com.datatype.TaskSolving;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 1;
        while(choice != 0) {
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
