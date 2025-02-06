

public class ReverseUsingStringBuilder {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}