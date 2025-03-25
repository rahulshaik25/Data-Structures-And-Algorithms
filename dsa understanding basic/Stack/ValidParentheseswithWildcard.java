import java.util.*;

public class ValidParentheseswithWildcard {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        Stack<Character> s = new Stack<>();
        System.out.println("Enter the parentheses string with a wildcard:");
        String par = x.nextLine();

        char[] arr = par.toCharArray();
        int Lcount = 0; // Count of '('
        int Rcount = 0; // Count of ')'
        List<Integer> wildcardIndices = new ArrayList<>(); // To store positions of '*'

        // Traverse the array to count '(' and ')' and store wildcards
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                Lcount++;
            } else if (arr[i] == ')') {
                Rcount++;
            } else if (arr[i] == '*') {
                wildcardIndices.add(i); // Store index of wildcard
            }
        }

        // Balance the parentheses by replacing '*' if needed
        for (int index : wildcardIndices) {
            if (Lcount > Rcount) {
                arr[index] = ')'; // Replace '*' with ')'
                Rcount++;
            } else if (Lcount < Rcount) {
                arr[index] = '('; // Replace '*' with '('
                Lcount++;
            } else {
                arr[index] = ' '; // Replace '*' with empty (no change to counts)
            }
        }

        // Re-check the balance of the modified string
        int balance = 0;
        for (char c : arr) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }

            // If balance goes negative, parentheses are invalid
            if (balance < 0) {
                System.out.println("False");
                return;
            }
        }

        // If balance is 0, the string is valid
        if (balance == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        x.close(); // Close the scanner
    }
}
//// the above was my code and now the original code using stack is below with the commensted out statements

/*
 * import java.util.*;

public class ValidParentheseswithWildcard {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        Stack<Integer> openStack = new Stack<>(); // Stack to track '(' indices
        Stack<Integer> starStack = new Stack<>(); // Stack to track '*' indices
        System.out.println("Enter the parentheses string with a wildcard:");
        String par = x.nextLine();

        char[] arr = par.toCharArray();

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                openStack.push(i); // Track '('
            } else if (arr[i] == '*') {
                starStack.push(i); // Track '*'
            } else if (arr[i] == ')') {
                if (!openStack.isEmpty()) {
                    openStack.pop(); // Use '(' to match ')'
                } else if (!starStack.isEmpty()) {
                    starStack.pop(); // Use '*' to match ')'
                } else {
                    System.out.println("False");
                    x.close();
                    return; // Unmatched ')' means invalid
                }
            }
        }

        // Match remaining '(' with '*' if possible
        while (!openStack.isEmpty() && !starStack.isEmpty()) {
            if (openStack.peek() < starStack.peek()) {
                openStack.pop();
                starStack.pop(); // Match '(' with '*'
            } else {
                break; // If '(' appears after '*', invalid
            }
        }

        // If there are unmatched '(', the string is invalid
        if (openStack.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        x.close(); // Close the scanner
    }
}

 */