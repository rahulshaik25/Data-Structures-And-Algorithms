import java.util.*;

public class CelebrityProblem {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of people (matrix size):");
        int n = x.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter the values for the matrix (row by row, 0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = x.nextInt();
            }
        }

        int celebrity = findCelebrity(arr, n);
        if (celebrity == -1) {
            System.out.println("There is no celebrity.");
        } else {
            System.out.println("The celebrity is person " + celebrity + ".");
        }

        x.close(); // Close the scanner
    }

    public static int findCelebrity(int[][] arr, int n) {
        // Step 1: Find a potential celebrity
        int candidate = 0;
        for (int i = 1; i < n; i++) {
            if (arr[candidate][i] == 1) {
                // Candidate knows i, so candidate can't be the celebrity
                candidate = i;
            }
        }

        // Step 2: Verify the candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // Celebrity must not know anyone and must be known by everyone
                if (arr[candidate][i] == 1 || arr[i][candidate] == 0) {
                    return -1; // Candidate fails the conditions
                }
            }
        }

        return candidate; // Candidate is the celebrity
    }
}
