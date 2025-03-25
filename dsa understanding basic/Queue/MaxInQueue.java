import java.util.*;
public class MaxInQueue 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();
        System.out.println("Enter the numbers into the quewue -1 to stop");

        while(true)
        {
            int input =x.nextInt();
            if(input==-1)
            {
                break;
            }
            q.add(input);

            
        }
        int max = q.peek();
        while(!q.isEmpty())
        {
            int comp = q.poll();
            if(comp>max)
            {
                max=comp;
            }

        }
        System.out.println(max + " is the max num");
    }    
}
