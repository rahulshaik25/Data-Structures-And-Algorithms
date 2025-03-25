import java.util.*;
public class ReverseQueue 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();
        Stack<Integer> s = new Stack<>();

        System.out.println("Enter the numbers into queue (-1 to stop):");

        while (true) {
            int a = x.nextInt();
            if (a == -1) {
                break;
            }
            q.add(a);
        }

        // Push queue elements into stack
        while (!q.isEmpty()) {
            s.push(q.poll());
        }

        // Pop stack elements back into the queue (reversing it)
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        // Display the reversed queue
        System.out.println("Reversed Queue:");
        for (int num : q) {
            System.out.print(num + " ");
        }
    }
}
