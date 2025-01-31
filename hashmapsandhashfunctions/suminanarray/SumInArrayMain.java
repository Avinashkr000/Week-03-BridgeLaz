
import static com.Day02.hashmapsandhashfunctions.suminanarray.SumInAnArray.hasPairWithSum;

public static void main(String[] args) {
    int[] nums = {1, 4, 45, 6, 10, 8};
    int target = 16;

    if (hasPairWithSum(nums, target)) {
        System.out.println("Pair with sum " + target + " exists.");
    } else {
        System.out.println("Pair with sum " + target + " does not exist.");
    }
}
