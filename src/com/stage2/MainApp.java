package com.stage2;

import com.stage2.task_10.Direction;
import com.stage2.task_10.Robot;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 1;
        while(choice != 0) {
            System.out.println();
            System.out.println("Введите 1 для задачи 7\n" + "Введите 2 для задачи 8\n" + "Введите 3 для задачи 9\n" +
                    "Введите 4 для задачи 10\n" + "Введите 5 для задачи 11\n" + "Введите 6 для задачи 12\n" + 
                    "Введите 7 для задачи 13\n" + "Введите 8 для задачи 15\n" + "Введите 0 to exit");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.println("Фрактал: " + TaskSolving.task7(7));
                    break;
                case 2:
                    System.out.println("Массив после слияния: ");
                    int[] array = TaskSolving.task8(new int[]{2, 3, 5}, new int[]{1, 4});
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    break;
                case 3:
                    System.out.println("Отфильтрованный сценарий:\n" + TaskSolving.task9(
                            new String[]{
                                    "Городничий",
                                    "Аммос Федорович",
                                    "Артемий Филиппович",
                                    "Лука Лукич"
                            },
                            new String[]{
                                    "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                                    "Аммос Федорович: Как ревизор?",
                                    "Артемий Филиппович: Как ревизор?",
                                    "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                                    "Аммос Федорович: Вот те на!",
                                    "Артемий Филиппович: Вот не было заботы, так подай!",
                                    "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                            }
                    ));
                    break;
                case 4:
                    System.out.println("Результат путешествия робота:");
                    TaskSolving.task10(new Robot(0,0, Direction.UP), new Point(3,3));
                    break;
                case 5:
                    System.out.println("Резултат проверки чисел и работы equal вместе с hashcode:");
                    TaskSolving.task11();
                    break;
                case 6:
                    System.out.println("Результат работы фильтров текста:");
                    TaskSolving.task12();
                    break;
                case 7:
                    System.out.println("Результат работы sqrt: " + TaskSolving.task13(4));
                    break;
                case 8:
                    System.out.println("Результат работы Pair: ");
                    TaskSolving.task15();
                    break;
            }
        }
    }
}
