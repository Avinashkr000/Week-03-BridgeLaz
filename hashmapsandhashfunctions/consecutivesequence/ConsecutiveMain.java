import static com.Day02.hashmapsandhashfunctions.consecutivesequence.ConsecutiveSequence.longestConsecutive;

public static void main(String[] args) {
    int[] nums = {100, 4, 200, 1, 3, 2};

    int length = longestConsecutive(nums);

    System.out.println("Length of the  longest consecutive sequence is : " + length);
}