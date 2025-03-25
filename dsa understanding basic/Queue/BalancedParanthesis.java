//Check for Balanced Parentheses using a Queue.
import java.util.*;
public class BalancedParanthesis 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        Queue<Character> q = new ArrayDeque<>();
        System.out.println("Enter the paranthesis input");
         String input = x.nextLine();
         char[] arr = input.toCharArray();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]=='(')
            {
                q.add(arr[i]);
            }
            else if(arr[i]==')')
            {
                if(q.isEmpty())
                {
                    System.out.println("It is balanced");
                    break;
                }
               
                q.poll();
            }
        }
        if(!q.isEmpty())
        {
            System.out.println("It is not balanced");
        }

    }    
}
