package com.datatype;

/**
 * Данный клас реализует методы решения задачи 1
 *
 * Задача 1:
 * Реализуйте метод, возвращающий true,
 * если среди четырех его аргументов ровно два истинны (любые).
 * Во всех остальных случаях метод должен возвращать false.
 * Cоставьте формулу с использованием булевых операторо
 *
 * @version   15 Jul 2021
 * @author    Эмирян Владимир
 */
public class Task1 {
    /**
     * Метод реализующий решение задачи 1
     */
    public static boolean checkStatement(boolean term1, boolean term2, boolean term3, boolean term4) {
        //При конвертации в числа, сумма термов будет равна 2
        return booleanToInt(term1) + booleanToInt(term2) + booleanToInt(term3)
                + booleanToInt(term4) == 2;
    }

    /**
     * Вспомогательный метод, конвертирующий true и false в 1 и 0 соответственно
     */
    private static int booleanToInt(boolean term) {
        return (Boolean.toString(term).equals("true")) ? 1 : 0;
    }
}
