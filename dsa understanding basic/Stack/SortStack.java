import java.util.*;
//Given a stack of integers, sort it such that the smallest element is at the top. You may use one additional stack.
class SortStack
{
    
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        System.out.println("Enter the numbers into the stack -1 to end the input ");
        while(true)
        {
            int input = x.nextInt();
            if(input==-1)
            {
                break;
            }
            s.push(input);
            
        }

        while(!s.isEmpty())
        {
            int n =s.pop();

            while(!s2.isEmpty() && s2.peek()>n )
            {
                s.push(s2.pop());
            }
            s2.push(n);
        }
        System.out.println("Sorted Stack (smallest element at the top): ");
        while (!s2.isEmpty()) {
            System.out.println(s2.pop());
        }
    }
}