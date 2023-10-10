package org.utz.offer;

import java.util.Stack;

public class Pb040MaximalRectangle {
    public int maximalRectangle(String[] matrix) {
        if (matrix.length == 0) {
            return 0;
        }

        int maxArea = 0;

        for (int i = 0; i < matrix.length; i++) {
            int[] heights = new int[matrix[0].length()];
            for (int j = 0; j < heights.length; j++) {
                int k = i;
                while (k >= 0 && matrix[k].charAt(j) == '1') {
                    heights[j]++;
                    k--;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

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
