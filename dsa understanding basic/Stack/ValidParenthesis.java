import java.util.*;

class ValidCheck {
    Scanner x = new Scanner(System.in);

    void checkValidity() {
        boolean isvalid = true; // Assume true until proven otherwise
        System.out.println("Enter the parenthesis");

        String par = x.nextLine();
        char[] parArray = par.toCharArray();
        Stack<Character> pa = new Stack<>();

        for (int i = 0; i < parArray.length; i++) {
            if (parArray[i] == '{' || parArray[i] == '[' || parArray[i] == '(') {
                pa.push(parArray[i]); // Push opening brackets
            } else if (parArray[i] == '}' || parArray[i] == ']' || parArray[i] == ')') {
                if (!pa.isEmpty() && ((pa.peek() == '{' && parArray[i] == '}') || 
                                      (pa.peek() == '[' && parArray[i] == ']') || 
                                      (pa.peek() == '(' && parArray[i] == ')'))) {
                    pa.pop(); // Pop matching opening bracket
                } else {
                    isvalid = false; // Invalid closing bracket
                    break; // Exit early
                }
            }
        }

        // Final check if stack is empty (all brackets matched)
        if (!pa.isEmpty()) {
            isvalid = false; // Unmatched opening brackets
        }

        // Print final validity status
        System.out.println(isvalid);
    }
}

public class ValidParenthesis {
    public static void main(String args[]) {
        ValidCheck v = new ValidCheck();
        v.checkValidity();
    }
}


/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 
 */
