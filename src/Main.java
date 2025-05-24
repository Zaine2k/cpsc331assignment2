import java.util.Arrays;
import java.util.Stack;

public class Main {

    // Question 1
    // Sources Used:
    // https://www.geeksforgeeks.org/single-pass-two-pass-and-multi-pass-compilers/
    public static int[] sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        // Iterate through the entire array and check each value.
        for (int count = 0; count <= end;) {

            // Sort 0 to the start of the array by swapping
            if (nums[count] == 0) {
                int x = nums[count];
                nums[count] = nums[start];
                nums[start] = x;
                start++;
                count++;

                // Sort 1 to the middle of the array
            } else if (nums[count] == 1) {
                count++;

                // Sort 2 to the end of the array by swapping
            } else {
                int x = nums[count];
                nums[count] = nums[end];
                nums[end] = x;
                end--;
            }
        }
        return nums;
    }

    // Question 3
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // Question 4
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            int product = power(x, n - 1) * x;
            return product;
        }
    }

    public static void main(String[] args) {
        // Question 1
        int[] input = {2, 0, 2, 1, 1, 0};
        int[] sorted = sortColors(input);
        System.out.println(Arrays.toString(sorted));

        // Question 3
        System.out.println(isBalanced("()[]"));
        System.out.println(isBalanced("([]"));
        System.out.println(isBalanced("[()]"));

        // Question 4
        System.out.println(power(2, 3));              // 8
    }
}
