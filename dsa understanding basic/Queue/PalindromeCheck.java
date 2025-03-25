import java.util.*;

public class PalindromeCheck {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> s = new Stack<>();
        System.out.println("Enter the numbers into the queue (use -1 to stop):");

        // Read input into the queue
        while (true) {
            int input = x.nextInt();
            if (input == -1) {
                break;
            }
            q.add(input);
        }

        // Add the first half of the queue to the stack
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            s.push(q.poll());
        }

        // If the queue has odd size, skip the middle element
        if (size % 2 != 0) {
            q.poll();
        }

        // Compare the stack and the remaining queue
        boolean isPalindrome = true;
        while (!q.isEmpty() && !s.isEmpty()) {
            if (!q.poll().equals(s.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The sequence is a palindrome.");
        } else {
            System.out.println("The sequence is not a palindrome.");
        }

        x.close();
    }
}
