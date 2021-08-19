package com.stage4;

import com.stage4.task_1.Counter;
import com.stage4.task_3.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Данный клас предоставляет методы показывающие работу решенных задач
 * @package Все дополнительные классы, требующиеся по условию задачи, расположены в отдельных пакетах соответственно
 * @version   19 Aug 2021
 * @author    Эмирян Владимир
 */
public class TaskSolving {
    /**
     * Метод реализующий решение задачи 1
     * Выводит результат операции инкремента
     */
    static void task1() throws InterruptedException {
        Counter counter = new Counter();

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    counter.increment();
                }
            }).start();
            Thread.sleep(300);
        }

        System.out.println(counter.get());
    }

    /**
     * Метод реализующий решение задачи 2
     * Выводит строку из сконкатенированных значений результатов потоков
     */
    static void task2() throws ExecutionException, InterruptedException {
        String resultRow = "";

        Callable<Integer> task = () -> {
            Thread.sleep(new Random().nextInt(10000));
            return new Random().nextInt(4) + 1;
        };
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {

            Future result = service.submit(task);
            resultRow += result.get().toString();
        }
        service.shutdown();

        System.out.println(resultRow);
    }

    /**
     * Метод реализующий решение задачи 3
     * Выводит количество срабатываний каждого потока
     */
    static void task3() {
        Map<String, Integer> countMap = new HashMap<>();
        ArrayList<Runnable> taskList = new ArrayList<>();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                taskList.add(() -> {
                    Task task = new Task();

                    try {
                        Thread.sleep(new Random().nextInt(10000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    String currentThreadName = Thread.currentThread().getName();
                    if (!countMap.containsKey(currentThreadName)) {
                        countMap.put(currentThreadName, 1);
                    } else {
                        countMap.put(currentThreadName, countMap.get(currentThreadName) + 1);
                    }
                });
            }
        }).start();

        //Создаем пулл потоков через фабричный метод
        ExecutorService service = Executors.newFixedThreadPool(2);

        //Раздаем потокам задачи
        for (int i = 0; i < 10; i++) {
            service.submit(taskList.get(i));
        }
        service.shutdown();

        //Ждем пока потоки завершат свою работу
        while(!service.isTerminated());

        //Выводим потоки и количество их задействий
        for (var entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}