import java.util.*;

class Solution {
    public int jump(int[] nums) {
        int maxreach = 0;
        int count = 0;
        int currentEnd = 0; // To track the current jump range

        for (int i = 0; i < nums.length - 1; i++) { // Loop till the second last index
            maxreach = Math.max(maxreach, i + nums[i]); // Update maximum reach
            
            if (i == currentEnd) { // When we reach the end of the current range
                count++;
                currentEnd = maxreach; // Update the range for the next jump
            }

            if (currentEnd >= nums.length - 1) { // If we can reach the end
                return count;
            }
        }
        return count;
    }
}

public class JumpIndexWithCount {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);

        Solution s = new Solution();

        System.out.println("Enter the size of the array:");
        int n = x.nextInt();

        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }

        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Minimum jumps required: " + s.jump(arr));
    }
}
