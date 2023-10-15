package org.utz.offer;

import java.util.LinkedList;
import java.util.Queue;

public class Pb042RecentCounter {
    private Queue<Integer> windows;
    private int size;
    public Pb042RecentCounter() {
        windows = new LinkedList<>();
        size = 3000;
    }

    public int ping(int t) {
        while (!windows.isEmpty() && t - windows.peek() > size) {
            windows.poll();
        }
        windows.offer(t);
        return windows.size();
    }
}
