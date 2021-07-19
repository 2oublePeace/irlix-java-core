package com.datatype;

import com.datatype.TaskSolving.Methods;
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
                    System.out.println("Two arguments is true: " + Methods.checkStatement(true, false, true, false));
                    break;
                case 2:
                    System.out.println("Result of flipBit method: " + Methods.flipBit(34, 5));
                    break;
                case 3:
                    System.out.println("Count of leap years: " + Methods.countLeap(100));
                    break;
                case 4:
                    System.out.println("Result symbol from slash: " + Methods.distanceToSlash(32));
                    break;
                case 5:
                    System.out.println("Is two grade: " + Methods.isTwoGrade(-8));
                    break;
                case 6:
                    System.out.println("Is palindrome" + Methods.isPalindrome("Madam, I'm Adam!"));
                    break;
            }
        }
    }
}
