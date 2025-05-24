import java.util.Arrays;

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
                start++; // we increment to ignore the element we just swapped
                count++;

            // Sort 1 to the middle of the array, we don't need to worry because it serves as the middle point.
            } else if (nums[count] == 1) {
                count++;

            // Sort 2 to the end of the array by swapping elements to the end of the list.
            } else {
                int x = nums[count];
                nums[count] = nums[end];
                nums[end] = x;
                end--; // we decrement in order to ignore the element we just swapped.
            }
        }
        return nums;
    }

    // Question 3
    public static boolean isBalanced ( String s) {
        return false;
    }

    // Question 4
    public static int power (int x, int n) {
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

        // Question 4
        System.out.println(power(2,3));


    }
}
