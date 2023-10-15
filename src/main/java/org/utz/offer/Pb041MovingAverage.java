package org.utz.offer;

import java.util.LinkedList;
import java.util.Queue;

public class Pb041MovingAverage {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;
    private int sum;
    /** Initialize your data structure here. */
    public Pb041MovingAverage(int size) {
        capacity = size;
    }

    public double next(int val) {
        if (queue.size() >= capacity) {
            int first = queue.poll();
            sum -= first;
        }
        sum += val;
        queue.offer(val);
        return (double) sum / queue.size();
    }
}
