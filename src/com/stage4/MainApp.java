package com.stage4;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class MainApp {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner in = new Scanner(System.in);
        int choice = 1;
        while(choice != 0) {
            System.out.println();
            System.out.println("Введите 1 для задачи 1\n" + "Введите 2 для задачи 2\n" + "Введите 3 для задачи 3\n" +
                    "Введите 4 для задачи 4\n");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.println("Результат операции инкремента:");
                    TaskSolving.task1();
                    break;
                case 2:
                    System.out.println("Результат сконкатенированных значений результатов потоков:");
                    TaskSolving.task2();
                    break;
                case 3:
                    System.out.println("Символ-количество:");
                    TaskSolving.task3();
                    break;
                case 4:
                    System.out.println("Коллекция уникальных объектов:");

                    break;
            }
        }
    }
}
