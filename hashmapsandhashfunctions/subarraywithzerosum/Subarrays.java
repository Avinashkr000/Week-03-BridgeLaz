
import java.util.List;

import static com.Day02.hashmapsandhashfunctions.subarraywithzerosum.ZeroSum.findZeroSumSubarrays;

public static void main(String[] args) {
    int[] nums = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};

    List<List<Integer>> zeroSumSubarrays = findZeroSumSubarrays(nums);

    System.out.println("Subarrays with zero sum:");
    for (List<Integer> subarray : zeroSumSubarrays) {
        System.out.println(subarray);
    }
}