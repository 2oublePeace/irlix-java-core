package com.stage3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 1;
        while(choice != 0) {
            System.out.println();
            System.out.println("Введите 1 для задачи 1\n" + "Введите 2 для задачи 2\n" + "Введите 3 для задачи 3\n" +
                    "Введите 4 для задачи 4\n" + "Введите 5 для задачи 5\n" + "Введите 6 для задачи 6\n");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.println("Cимметрическая разность множеств: ");
                    TaskSolving.task1(List.of(1,2,3), List.of(0,1,2));
                    break;
                case 2:
                    System.out.println("Массив после фильтрации:");
                    TaskSolving.task2();
                    break;
                case 3:
                    System.out.println("Символ-количество:");
                    TaskSolving.task3("Lorem ipsum de lorem");
                    break;
                case 4:
                    System.out.println("Коллекция уникальных объектов:");
                    TaskSolving.task4(new ArrayList(Arrays.asList("string", "string", 1, '2', true, false, true)));
                    break;
                case 5:
                    System.out.println("Время затрат:");
                    TaskSolving.task5();
                    break;
                case 6:
                    System.out.println("Перевернутый HashMap:");
                    TaskSolving.task6();
                    break;
            }
        }
    }
}
