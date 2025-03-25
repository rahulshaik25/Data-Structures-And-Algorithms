import java.util.*;
public class QueueUsingArray 
{
    void pop(ArrayList<Integer> arr)
    {
        arr.remove(0);
        System.out.println(arr);
    }
    void push(ArrayList<Integer> arr, int value)
    {
        arr.add(value);
        System.out.println(arr);
    }
    
    public static void main(String args[])
    {
        QueueUsingArray q = new QueueUsingArray();
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the integers in the queue(-1 to stop)");
        ArrayList<Integer> arr = new ArrayList<>();
        while(true)
        {
            int input = x.nextInt();
            if(input ==-1)
            {
                break;
            }
            arr.add(input);
        }
        System.out.println(arr);
        System.out.println("Do u want to push or pop in this 1- push 2- pop other nums- fuckoff");
        int p = x.nextInt();
        switch(p)
        {
            case 1:
            {
                System.out.println("Enter the value to push:");
                int value = x.nextInt();
                q.push(arr,value);
                break;
            }
            case 2:
            {
                q.pop(arr);
                break;
            }
            default:
            {
                break;
            }


        }

    }    
}
