package com.stage4.task_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private volatile AtomicInteger counter;

    public Counter() {
        counter = new AtomicInteger(0);
    }

    public synchronized void increment() {
        counter.incrementAndGet();
    }

    public int get() {
        return counter.get();
    }
}
