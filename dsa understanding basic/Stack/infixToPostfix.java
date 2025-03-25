import java.util.*;

public class infixToPostfix {
    // Function to determine precedence of operators
    public static int precedence(char operator) {
        switch (operator) {
            case '+': case '-':
                return 1; // Lowest precedence
            case '*': case '/':
                return 2; // Higher precedence
            case '^':
                return 3; // Highest precedence
            default:
                return -1; // Invalid operator
        }
    }

    // Function to convert infix to postfix
    public static String postfixConvert(String s) {
        Stack<Character> converter = new Stack<>(); // Stack for operators
        StringBuilder postfix = new StringBuilder(); // To build the postfix expression

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char current = arr[i];

            // If the current character is an operand (letter or digit), append it to postfix
            if (Character.isLetterOrDigit(current)) {
                postfix.append(current);
            }
            // If the current character is an operator
            else if (current == '+' || current == '-' || current == '*' || current == '/') {
                while (!converter.isEmpty() && precedence(converter.peek()) >= precedence(current)) {
                    postfix.append(converter.pop());
                }
                converter.push(current); // Push the current operator to the stack
            }
            // If the current character is '(', push it to the stack
            else if (current == '(') {
                converter.push(current);
            }
            // If the current character is ')', pop and append until '(' is encountered
            else if (current == ')') {
                while (!converter.isEmpty() && converter.peek() != '(') {
                    postfix.append(converter.pop());
                }
                converter.pop(); // Remove '(' from the stack
            }
        }

        // Pop all remaining operators from the stack
        while (!converter.isEmpty()) {
            postfix.append(converter.pop());
        }

        return postfix.toString(); // Return the final postfix expression
    }

    // Main method
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the infix expression: ");
        String infExp = x.nextLine();
        System.out.println("Postfix expression: " + postfixConvert(infExp));
        x.close();
    }
}
