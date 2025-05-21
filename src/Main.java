import java.util.Arrays;

public class Main {
    public static int[] sortColors(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        for (int i = 0; i <= end;) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] input = {0, 0, 2, 2, 1, 1};
        int[] sorted = sortColors(input);
        System.out.println(Arrays.toString(sorted)); // should print: [0, 0, 1, 1, 2, 2]
    }
}
