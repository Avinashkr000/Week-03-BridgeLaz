package com.Day02.hashmapsandhashfunctions.subarraywithzerosum;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZeroSum {

    public static List<List<Integer>> findZeroSumSubarrays(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == 0) {
                result.add(getSubarray(nums, 0, i));
            }

            if (sumMap.containsKey(sum)) {
                for (int index : sumMap.get(sum)) {
                    result.add(getSubarray(nums, index + 1, i));
                }
            }

            sumMap.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }

    private static List<Integer> getSubarray(int[] nums, int start, int end) {
        List<Integer> subarray = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            subarray.add(nums[i]);
        }
        return subarray;
    }
}