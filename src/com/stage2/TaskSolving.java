package com.stage2;

import com.stage2.task10.Robot;
import com.stage2.task11.ComplexNumber;
import com.stage2.task12.Label;
import com.stage2.task12.NegativeTextAnalyzer;
import com.stage2.task12.SpamAnalyzer;
import com.stage2.task12.TooLongTextAnalyzer;

import java.awt.*;

/**
 * Данный клас реализует методы решения задач
 * @version   05 Aug 2021
 * @author    Эмирян Владимир
 */
public class TaskSolving {

    /**
     * Метод реализующий решение задачи 7
     * @return целочисленное число, являющееся факториалом входного аргумента
     */
    static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    /**
     * Метод реализующий решение задачи 8
     * @return целочисленный массив после слияния
     */
    static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int i = 0, j = 0;
        for (int k = 0; i < a1.length && j < a2.length; k++) {
            if(a1[i] < a2[j]) {
                result[k] = a1[i];
                i++;
            } else {
                result[k] = a2[j];
                j++;
            }

            if (i == a1.length) {
                while (j < a2.length) {
                    result[++k] = a2[j++];
                }
                return result;
            } else if (j == a2.length) {
                while (i < a1.length) {
                    result[++k] = a1[i++];
                }
                return result;
            }
        }
        return result;
    }

    /**
     * Метод реализующий решение задачи 9
     * @return строку сценария разбитого по ролям
     */
    static String roles(String[] roles, String[] textLines) {
        String result = "";
        for (var role : roles) {
            int rowIndex = 1;
            result += role + "\n";
            for (var row : textLines) {
                if(row.contains(role + ":")) {
                    result += rowIndex + ")" + row.replaceAll(role + ":", "") + "\n";
                }
                rowIndex++;
            }
            result += "\n";
        }
        return result;
    }

    /**
     * Метод реализующий решение задачи 10
     */
    static void robot(Robot robot, Point target) {
        if(robot.getX() < target.x) {
            switch (robot.getDirection()) {
                case DOWN -> robot.turnLeft();
                case LEFT -> {
                    robot.turnLeft();
                    robot.turnLeft();
                }
                case UP -> robot.turnRight();
            }

            while (robot.getX() < target.x) {
                robot.stepForward();
            }
        } else if(robot.getX() > target.x) {
            switch (robot.getDirection()) {
                case DOWN -> robot.turnRight();
                case RIGHT -> {
                    robot.turnRight();
                    robot.turnRight();
                }
                case UP -> robot.turnLeft();
            }

            while (robot.getX() > target.x) {
                robot.stepForward();
            }
        } else if(robot.getY() > target.y) {
            switch (robot.getDirection()) {
                case RIGHT -> robot.turnRight();
                case UP -> {
                    robot.turnRight();
                    robot.turnRight();
                }
                case LEFT -> robot.turnLeft();
            }

            while (robot.getY() > target.y) {
                robot.stepForward();
            }
        } else if(robot.getY() < target.y) {
            switch (robot.getDirection()) {
                case LEFT -> robot.turnRight();
                case DOWN -> {
                    robot.turnRight();
                    robot.turnRight();
                }
                case RIGHT -> robot.turnLeft();
            }

            while (robot.getY() < target.y) {
                robot.stepForward();
            }
        }
    }

    /**
     * Метод реализующий решение задачи 10
     */
    static void overeq() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(2, 1);
        System.out.println(a.equals(b));
        System.out.println(b.hashCode());
    }

    /**
     * Метод реализующий решение задачи 11
     */
    static void task11() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(2, 1);
        System.out.println(a.equals(b));
        System.out.println(b.hashCode());
    }

    /**
     * Метод реализующий решение задачи 12
     */
    static Label checkLabel() throws Exception {
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[] {"a", "b", "c"});
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer(new String[] {"a", "b", "c"});
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer();

        if(spamAnalyzer.processText("asda") != Label.OK) {
            throw new Exception("sdsdf");
        } else if(negativeTextAnalyzer.processText("asda") != Label.OK) {
            throw new Exception("sdsdf");
        } else if(tooLongTextAnalyzer.processText("asda") != Label.OK) {
            throw new Exception("sdsdf");
        }

        return Label.OK;
    }

    /**
     * Метод реализующий решение задачи 13
     * @return
     */
    static double mySqrt(double a) throws Exception {
        if(a < 0) {
            throw new Exception("sdsdf");
        }
        return Math.sqrt(a);
    }
}
