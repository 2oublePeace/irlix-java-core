package com.stage2;

import com.stage2.task_10.Robot;
import com.stage2.task_11.ComplexNumber;
import com.stage2.task_12.*;
import com.stage2.task_12.Label;
import com.stage2.task_15.Pair;
import java.awt.*;

/**
 * Данный клас предоставляет методы показывающие работу решенных задач
 * @package Все дополнительные классы, требующиеся по условию задачи, расположены в отдельных пакетах соответственно
 * @version   05 Aug 2021
 * @author    Эмирян Владимир
 */
public class TaskSolving {

    /**
     * Метод реализующий решение задачи 7
     * @return целочисленное число, являющееся факториалом входного аргумента
     */
    static int task7(int n) {
        return (n == 0) ? 1 : n * task7(n - 1);
    }

    /**
     * Метод реализующий решение задачи 8
     * @return целочисленный массив после слияния
     */
    static int[] task8(int[] a1, int[] a2) {
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
     * @return строку содержащую сценарий разбитый по ролям
     */
    static String task9(String[] roles, String[] textLines) {
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
     * Создает экземпляр робота и ведет его до заданной точки
     */
    static void task10(Robot robot, Point target) {
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
        }
        if(robot.getY() > target.y) {
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
        System.out.println("Робот на месте!");
    }

    /**
     * Метод реализующий решение задачи 11
     * Создает экземпляр кастомного класса ComplexNumber и использует переопределенные equals и hashcode
     */
    static void task11() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(2, 1);
        System.out.println("работа equals: " + a.equals(b));
        System.out.println("работа hashcode: " + b.hashCode());
    }

    /**
     * Метод реализующий решение задачи 12
     * @return возвращает ярлык "OK" если проверка текста прошла успешно
     */
    static Label task12() {
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(new String[] {"a", "b", "c"});
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer(new String[] {":(", "=(", ":|"});
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer();
        String text = "Some text :|";
        try {
            if(spamAnalyzer.processText(text) != Label.OK) {
                throw new Exception("Spam exception");
            } else if(negativeTextAnalyzer.processText(text) != Label.OK) {
                throw new Exception("Negative text exception");
            } else if(tooLongTextAnalyzer.processText(text) != Label.OK) {
                throw new Exception("Too long text exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Label.OK;
    }

    /**
     * Метод реализующий решение задачи 13
     * @return квадрат числа или ошибку если аргумент отрицательное число
     */
    static double task13(double a)  {
        if(a < 0) {
            try {
                throw new Exception("Negative number");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return Math.sqrt(a);
    }

    /**
     * Метод реализующий решение задачи 15
     * Создает экземпляр кастомного класса Pair и использует его
     */
    static void task15()  {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst();
        String s = pair.getSecond();
        System.out.println(i + " - первый объект, " + s + " - второй объект");
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2);
        System.out.println("Равны ли pair и pair2?: " + mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
        System.out.println("Равны ли хэш коды pair и pair2?: " + mustAlsoBeTrue);
    }
}
