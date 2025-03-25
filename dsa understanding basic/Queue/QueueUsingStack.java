import java.util.*;

public class QueueUsingStack {
    Scanner x = new Scanner(System.in);

    // Enqueue elements into the queue
    void enqueue(Stack<Integer> q1) {
        while (true) {
            System.out.println("Enter a number to add into the queue (-1 to stop):");
            int a = x.nextInt();
            if (a == -1) {
                break;
            }
            q1.push(a);
        }
    }

    // Dequeue an element from the queue
    void dequeue(Stack<Integer> q2, Stack<Integer> q1) {
        if (q2.isEmpty()) { // Transfer elements only if q2 is empty
            while (!q1.isEmpty()) {
                q2.push(q1.pop());
            }
        }
        if (q2.isEmpty()) {
            System.out.println("Queue is empty! Nothing to dequeue.");
        } else {
            System.out.println("Dequeued: " + q2.pop());
        }
    }

    public static void main(String args[]) {
        Stack<Integer> q1 = new Stack<>();
        Stack<Integer> q2 = new Stack<>();
        QueueUsingStack Q = new QueueUsingStack();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Q.enqueue(q1);
                    break;
                case 2:
                    Q.dequeue(q2, q1);
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
