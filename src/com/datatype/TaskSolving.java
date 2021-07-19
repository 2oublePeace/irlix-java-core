package com.datatype;

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
    static boolean checkStatement(boolean term1, boolean term2, boolean term3, boolean term4) {
        //При конвертации в числа, сумма термов должна быть равна 2
        return booleanToInt(term1) + booleanToInt(term2) + booleanToInt(term3) + booleanToInt(term4) == 2;
    }

    /**
     * Вспомогательный метод, конвертирующий true и false в 1 и 0 соответственно
     * @return 1 или 0 в соответствии с true/false
     */
    static int booleanToInt(boolean term) {
        return (Boolean.toString(term).equals("true")) ? 1 : 0;
    }

    /**
     * Метод реализующий решение задачи 2
     * @return количество високосных годов
     */
    static int countLeap(int year) {
        return year / 4 - year / 100;
    }

    /**
     * Метод реализующий решение задачи 3
     * @return число с иныертированным битом
     */
    static int flipBit(int number, int position) {
        char[] bitsOfNumber = Integer.toBinaryString(number).toCharArray();
        bitsOfNumber[bitsOfNumber.length - position] = bitsOfNumber[position] == '0' ? '1' : '0';
        int result = Integer.parseInt(String.valueOf(bitsOfNumber), 2);
        return result;
    }

    /**
     * Метод реализующий решение задачи 4
     * @return символ на определенном расстоянии от символа"\"
     */
    static char distanceToSlash(int a) {
        return (char) ('\\' + a);
    }

    /**
     * Метод реализующий решение задачи 5
     * @return является ли число степенью двойки
     */
    static boolean isTwoGrade(int a) {
        return (Math.abs(a) == Integer.highestOneBit(Math.abs(a))) ? true : false;
    }

    /**
     * Метод реализующий решение задачи 6
     * @return является ли строка палиндроомом
     */
    static boolean isPalindrome(String inputString) {
        String filteredString = inputString.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder reverseFilteredString = new StringBuilder(filteredString).reverse();
        return (filteredString.equals(reverseFilteredString.toString())) ? true : false;
    }
}