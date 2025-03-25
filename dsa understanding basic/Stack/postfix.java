import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // Check if the token is an operator
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Pop the top two elements from the stack
                int b = stack.pop();
                int a = stack.pop();

                // Perform the operation and push the result back to the stack
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b); // Integer division truncates towards zero
                        break;
                }
            } else {
                // If the token is a number, parse it and push it onto the stack
                stack.push(Integer.parseInt(token));
            }
        }

        // The result is the only element left in the stack
        return stack.pop();
    }
}

public class postfix
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("Enter the RPN expression tokens separated by spaces (e.g., '2 1 + 3 *'):");
        String input = scanner.nextLine();

        // Split the input into tokens
        String[] tokens = input.split("\\s+");

        // Evaluate the expression
        int result = solution.evalRPN(tokens);

        // Print the result
        System.out.println("Result: " + result);
    }
}
