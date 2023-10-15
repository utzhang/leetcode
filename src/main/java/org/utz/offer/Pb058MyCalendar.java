package org.utz.offer;

import java.util.TreeMap;

public class Pb058MyCalendar {
    private TreeMap<Integer, Integer> treeMap;
    public Pb058MyCalendar() {
        treeMap = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        if ((treeMap.floorKey(start) == null || treeMap.get(treeMap.floorKey(start)) <= start)
                && (treeMap.higherKey(start) == null || treeMap.higherKey(start) >= end)) {
            treeMap.put(start, end);
            return true;
        }
        return false;
    }
}
