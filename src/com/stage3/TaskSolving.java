package com.stage3;

import java.util.*;

/**
 * Данный клас предоставляет методы показывающие работу решенных задач
 * @package Все дополнительные классы, требующиеся по условию задачи, расположены в отдельных пакетах соответственно
 * @version   08 Aug 2021
 * @author    Эмирян Владимир
 */
public class TaskSolving {

    /**
     * Метод реализующий решение задачи 1
     * Выводит симметрическую разность множеств
     */
    static void task1(List<Integer> array1, List<Integer> array2) {
        List<Integer> resultArray = new ArrayList<>();
        for (var number : array2) {
            if(!array1.contains(number)) {
                resultArray.add(number);
            }
        }

        for (var number : array1) {
            if(!array2.contains(number)) {
                resultArray.add(number);
            }
        }

        for (var number : resultArray) {
            System.out.print(number + " ");
        }
    }

    /**
     * Метод реализующий решение задачи 2
     * Выводит массив без элемнтов с четным индексом
     */
    static void task2() {
        int n = 0;
        Scanner in = new Scanner(System.in);
        List<Integer> resultList = new ArrayList<>();

        while (in.hasNextInt()){
            if (n % 2 != 0){
                resultList.add(in.nextInt());
            } else {
                in.next();
            }
            n++;
        }

        for (var number : resultList) {
            System.out.print(number + " ");
        }
    }

    /**
     * Метод реализующий решение задачи 3
     * Выводит хэшмап символ-колисчество
     */
    static void task3(String text) {
        char[] textArray = text.toCharArray();
        Map<Character, Integer> count = new HashMap<>();
        for(var c : textArray) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry);
        }
    }

    /**
     * Метод реализующий решение задачи 4
     * @return коллекцию уникальных объектов
     */
    static Collection<Object> task4(Collection<Object> objects) {
        Set<Object> set = new HashSet<>();
        for(var object : objects) {
            set.add(object);
        }
        objects.clear();
        for(var element : set) {
            objects.add(element);
            System.out.println(element);
        }
        return objects;
    }

    /**
     * Метод реализующий решение задачи 5
     * Выводит время затрат на обращение к массиву и списку
     * @return
     */
    static void task5() {
        List<Integer> list = new LinkedList<>();
        List<Integer> array = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            list.add(1337);
        }

        Date currentTime = new Date();

        for (int i = 0; i < 1000; i++) {
            list.get(random.nextInt(10000));
        }

        Date newTime = new Date();
        System.out.println("Время для массива: " + (newTime.getTime() - currentTime.getTime()));

        for (int i = 0; i < 10000; i++) {
            array.add(1337);
        }

        currentTime = new Date();

        for (int i = 0; i < 1000; i++) {
            list.get(random.nextInt(10000));
        }

        newTime = new Date();

        System.out.println("Время для списка: " + (newTime.getTime() - currentTime.getTime()));
    }

    /**
     * Метод реализующий решение задачи 4
     * @return
     */
    static Map<Integer, List<String>> task6() {
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, List<String>> reverseMap = new HashMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 2);

        for (var entry : map.entrySet()) {
            if(reverseMap.containsKey(entry.getValue())) {
                reverseMap.get(entry.getValue()).add(entry.getKey());
            } else {
                List<String> list = new LinkedList<>();
                list.add(entry.getKey());
                reverseMap.put(entry.getValue(), list);
            }
        }
        return reverseMap;
    }
}
