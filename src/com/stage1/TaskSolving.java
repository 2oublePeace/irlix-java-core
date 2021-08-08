package com.stage1;

import static com.stage1.task1.Cast.booleanToInt;

/**
 * Данный клас реализует методы решения задач
 * @version   15 Jul 2021
 * @author    Эмирян Владимир
 */
public class TaskSolving {

    /**
     * Метод реализующий решение задачи 1
     * @return являются ли только два аругумента со значением true
     */
    static boolean task1(boolean term1, boolean term2, boolean term3, boolean term4) {
        //При конвертации в числа, сумма термов должна быть равна 2
        return booleanToInt(term1) + booleanToInt(term2) + booleanToInt(term3) + booleanToInt(term4) == 2;
    }

    /**
     * Метод реализующий решение задачи 2
     * @return количество високосных годов
     */
    static int task2(int year) {
        return year / 4 - year / 100 + year / 400;
    }

    /**
     * Метод реализующий решение задачи 3
     * @return число с инвертированным битом
     */
    static int task3(int number, int position) {
        char[] bitsOfNumber = Integer.toBinaryString(number).toCharArray();
        bitsOfNumber[bitsOfNumber.length - position] = bitsOfNumber[bitsOfNumber.length - position] == '0' ? '1' : '0';
        int result = Integer.parseInt(String.valueOf(bitsOfNumber), 2);
        return result;
    }

    /**
     * Метод реализующий решение задачи 4
     * @return символ на определенном расстоянии от символа"\"
     */
    static char task4(int a) {
        return (char) ('\\' + a);
    }

    /**
     * Метод реализующий решение задачи 5
     * @return является ли число степенью двойки
     */
    static boolean task5(int a) {
        return (Math.abs(a) == Integer.highestOneBit(Math.abs(a)));
    }

    /**
     * Метод реализующий решение задачи 6
     * @return является ли строка палиндроомом
     */
    static boolean task6(String inputString) {
        String filteredString = inputString.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder reverseFilteredString = new StringBuilder(filteredString).reverse();
        return (filteredString.equals(reverseFilteredString.toString()));
    }
}