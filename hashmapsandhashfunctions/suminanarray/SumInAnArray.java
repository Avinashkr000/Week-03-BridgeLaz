package com.Day02.hashmapsandhashfunctions.suminanarray;


import java.util.HashMap;
import java.util.Map;

public class SumInAnArray {

    public static boolean hasPairWithSum(int[] nums, int target) {
        Map<Integer, Boolean> visited = new HashMap<>();

        for (int num : nums) {
            int complement = target - num;
            if (visited.containsKey(complement)) {
                return true;
            }
            visited.put(num, true);
        }

        return false;
    }

}