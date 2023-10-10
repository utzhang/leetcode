package org.utz.offer;

import java.util.Stack;

public class Pb039LargestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                int prevIndex = stack.pop();
                int start = stack.isEmpty() ? -1 : stack.peek();
                int end = i;
                maxArea = Math.max(maxArea, (end - start - 1) * heights[prevIndex]);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            int start = stack.isEmpty() ? -1 : stack.peek();
            int end = heights.length - 1;
            maxArea = Math.max(maxArea, (end - start) * heights[index]);
        }

        return maxArea;
    }
}
