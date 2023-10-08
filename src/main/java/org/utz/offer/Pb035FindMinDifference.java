package org.utz.offer;

import java.util.List;

public class Pb035FindMinDifference {
    public int findMinDifference(List<String> timePoints) {
        boolean[] times = new boolean[1440];

        for (String timePoint : timePoints) {
            String[] temp = timePoint.split(":");
            int time = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
            if (times[time]) {
                return 0;
            }
            times[time] = true;
        }

        return calculateMinDifference(times);
    }

    private int calculateMinDifference(boolean[] times) {
        int prev = -1;
        int first = -1;
        int last = times.length - 1;
        int minDiff = times.length - 1;

        for (int i = 0; i < times.length; i++) {
            if (!times[i]) {
                continue;
            }
            if (prev != -1) {
                minDiff = Math.min(minDiff, i - prev);
                last = i;
            } else {
               first = i;
            }
            prev = i;
        }
        minDiff = Math.min(minDiff, first + 1440 - last);
        return minDiff;
    }

}
