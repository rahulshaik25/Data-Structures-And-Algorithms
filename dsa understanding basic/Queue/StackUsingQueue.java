import java.util.*;
public class StackUsingQueue 
{
    Scanner x = new Scanner(System.in);
    void push(Queue<Integer> q)
    {
        System.out.println("Enter the integer data into this stack -1 to stop input");
        
        while(true)
        {
            int input = x.nextInt();
            if(input==-1)
            {
                break;
            }
            q.add(input);
        }

        for(int i=0; i<q.size(); i++)
        {
            q.add(q.poll());
        }
    }

    void pop(Queue<Integer> q)
    {
        if (q.isEmpty()) { // Check if the queue is empty
            System.out.println("Stack is empty! Nothing to pop.");
        }
        else
        {
         int p =q.remove();
         System.out.println(p);
        }
    }
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();
        StackUsingQueue s = new StackUsingQueue();
        System.out.println("Which operation u wanna do 1-push 2-pop other num - breaks");
        
        while(true)
        {
            int z = x.nextInt();
            switch(z)
            {
                case 1:
                {
                    s.push(q);
                    break;
                }

                case 2:
                {
                    s.pop(q);
                    break;
                }
                default:
                {
                    break;
                }
            }
        }
    }    
}
