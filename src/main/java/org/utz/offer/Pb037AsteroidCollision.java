package org.utz.offer;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Pb037AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (int asteroid : asteroids) {
            if (stack.isEmpty()) {
                stack.push(asteroid);
                continue;
            }
            while (!stack.isEmpty()) {
                int top = stack.peek();
                if (top < 0 && asteroid > 0) {
                    stack.push(asteroid);
                    break;
                }
                if (top < 0 && asteroid < 0) {
                    stack.push(asteroid);
                    break;
                }
                if (top > 0 && asteroid > 0) {
                    stack.push(asteroid);
                    break;
                }

                if (-asteroid < top) {
                    break;
                }
                if (-asteroid == top) {
                    stack.pop();
                    break;
                }
                if (-asteroid > top) {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(asteroid);
                        break;
                    }
                }
            }
        }
        int[] res = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            res[index] = stack.pop();
            index--;
        }
        return res;
    }

}
