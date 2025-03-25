import java.util.*;

class Solution {
    public int minBitFlips(int start, int goal) {
        // Convert integers to binary strings
        String startBin = Integer.toBinaryString(start);
        String goalBin = Integer.toBinaryString(goal);

        // Ensure both binary strings are of equal length
        int maxLength = Math.max(startBin.length(), goalBin.length());
        startBin = String.format("%" + maxLength + "s", startBin).replace(' ', '0');
        goalBin = String.format("%" + maxLength + "s", goalBin).replace(' ', '0');

        // Perform XOR operation and count the number of differing bits
        int bitFlips = 0;
        for (int i = 0; i < maxLength; i++) {
            if (startBin.charAt(i) != goalBin.charAt(i)) {
                bitFlips++;
            }
        }

        return bitFlips;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int startNumber = scanner.nextInt();
        System.out.println("Enter the goal number:");
        int goalNumber = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.minBitFlips(startNumber, goalNumber);
        System.out.println("Minimum number of bit flips: " + result);
    }
}
