import java.util.*;

class Solution {
    public boolean canJump(int[] nums) {
        int jLength = 0; // Maximum jump length reachable
        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond the maximum reachable length, return false
            if (i > jLength) {
                return false;
            }
            // Update the maximum reachable index
            jLength = Math.max(jLength, i + nums[i]);

            // If we can reach or exceed the last index, return true
            if (jLength >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}

public class jumpIndex {
    public static void main(String[] args) {
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
        boolean result = s.canJump(arr); // Capture the result

        // Print the result
        if (result) {
            System.out.println("You can reach the last index.");
        } else {
            System.out.println("You cannot reach the last index.");
        }
    }
}
