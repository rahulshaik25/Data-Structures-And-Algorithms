// Write a program to remove consecutive duplicate characters in a string using a stack.
// Input: "aabbccdde"
// Output: "e"
import java.util.*;
public class consecutiveduplicates 
{
    public static void main(String[] args)  {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the string input for checking duplicates");
        String str = x.nextLine();
        char[] arr = str.toCharArray();

        Stack<Character> charstack = new Stack<>();

        for (int i = 0; i < arr.length; i++) 
        {
            if (!charstack.isEmpty() && charstack.peek() == arr[i]) {
                charstack.pop(); // Remove the duplicate
            } else {
                charstack.push(arr[i]); // Push the character if it's not a duplicate
            }
        }

        StringBuilder res = new StringBuilder();
        while(!charstack.isEmpty())
        {
            res.insert(0,charstack.pop());
        }
        System.out.println(res);
        
    }
}
