import java.util.*;

class Solution {
    void palCheck() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int n = x.nextInt();

        if (n < 0) {
            System.out.println("Negative numbers can't be palindromes.");
            return; // Exit the method for negative numbers
        }

        ArrayList<Integer> al = new ArrayList<>();

        int original = n; // Store the original number for comparison
        while (n > 0) {
            al.add(n % 10); // Extract the last digit
            n = n / 10;     // Remove the last digit
        }

        // Check if the number is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < al.size() / 2; i++) {
            if (!al.get(i).equals(al.get(al.size() - 1 - i))) {
                isPalindrome = false;
                break;
            }
        }

        // Output results
        System.out.println("Array representation: " + al);
        if (isPalindrome) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}

public class PalindromeInt {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.palCheck();
    }
}
