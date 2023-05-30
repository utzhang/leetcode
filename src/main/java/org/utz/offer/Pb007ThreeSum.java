package org.utz.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pb007ThreeSum {
    // 遍历数组，对于其中nums[i]，求nums[i - length -1]中两数之和为 - nums[i]
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length >= 3) {
            Arrays.sort(nums);
            int i = 0;
            while (i < nums.length - 2) {
                twoSum(nums, i, result);
                int temp = nums[i];
                while (i < nums.length && temp == nums[i]) {
                    i++;
                }
            }
        }
        return result;
    }

    // 求 i + 1 ~ length 之间 和为 -nums[i]的两数
    private void twoSum(int[] nums, int i, List<List<Integer>> result) {
        int j = i + 1;
        int k = nums.length - 1;
        while (j < k) {
            if (nums[i] + nums[k] + nums[j] == 0) {
                result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                int temp = nums[j];
                while (j < k && nums[j] == temp) {
                    j++;
                }
            }
            if (nums[i] + nums[k] + nums[j] < 0) {
                j++;
            }
            if (nums[i] + nums[k] + nums[j] > 0) {
                k--;
            }
        }
    }
}
