import java.util.*;

class BinaryNumbers {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number till which you want binary numbers:");
        int num = x.nextInt();

        Queue<String> queue = new LinkedList<>(); // Queue to store binary numbers as strings

        queue.add("1"); // Start with "1"

        System.out.println("Binary numbers from 1 to " + num + ":");

        for (int i = 1; i <= num; i++) {
            String currentBinary = queue.poll(); // Remove the first number
            System.out.print(currentBinary + " "); // Print it
            queue.add(currentBinary + "0"); // Add the next two numbers
            queue.add(currentBinary + "1");
        }
    }
}
