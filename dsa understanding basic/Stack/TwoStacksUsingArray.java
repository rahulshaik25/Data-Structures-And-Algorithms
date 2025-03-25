import java.util.Scanner;

public class TwoStacksUsingArray {
    private int[] arr; // Array to store the elements of both stacks
    private int top1; // Pointer for the top of Stack 1
    private int top2; // Pointer for the top of Stack 2
    private int size; // Size of the array

    // Constructor to initialize the array and stack pointers
    public TwoStacksUsingArray(int n) {
        size = n; // Set the size of the array
        arr = new int[n]; // Create the array
        top1 = -1; // Stack 1 starts from the beginning of the array
        top2 = size; // Stack 2 starts from the end of the array
    }

    // Push operation for Stack 1
    public void push1(int value) {
        if (top1 < top2 - 1) { // Check if there is space in the array
            arr[++top1] = value; // Increment top1 and assign the value
            System.out.println(value + " pushed to Stack 1");
        } else {
            System.out.println("Stack 1 Overflow"); // No space left
        }
    }

    // Push operation for Stack 2
    public void push2(int value) {
        if (top1 < top2 - 1) { // Check if there is space in the array
            arr[--top2] = value; // Decrement top2 and assign the value
            System.out.println(value + " pushed to Stack 2");
        } else {
            System.out.println("Stack 2 Overflow"); // No space left
        }
    }

    // Pop operation for Stack 1
    public int pop1() {
        if (top1 >= 0) { // Check if Stack 1 is not empty
            int value = arr[top1--]; // Return the top element and decrement top1
            System.out.println(value + " popped from Stack 1");
            return value;
        } else {
            System.out.println("Stack 1 Underflow"); // Stack 1 is empty
            return -1; // Return -1 to indicate underflow
        }
    }

    // Pop operation for Stack 2
    public int pop2() {
        if (top2 < size) { // Check if Stack 2 is not empty
            int value = arr[top2++]; // Return the top element and increment top2
            System.out.println(value + " popped from Stack 2");
            return value;
        } else {
            System.out.println("Stack 2 Underflow"); // Stack 2 is empty
            return -1; // Return -1 to indicate underflow
        }
    }

    // Display the current state of the array
    public void displayArray() {
        System.out.print("Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt(); // Read the size of the array from the user

        TwoStacksUsingArray twoStacks = new TwoStacksUsingArray(n); // Create the two stacks

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push to Stack 1");
            System.out.println("2. Push to Stack 2");
            System.out.println("3. Pop from Stack 1");
            System.out.println("4. Pop from Stack 2");
            System.out.println("5. Display Array");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push to Stack 1: ");
                    int value1 = scanner.nextInt();
                    twoStacks.push1(value1);
                    break;

                case 2:
                    System.out.print("Enter the value to push to Stack 2: ");
                    int value2 = scanner.nextInt();
                    twoStacks.push2(value2);
                    break;

                case 3:
                    twoStacks.pop1();
                    break;

                case 4:
                    twoStacks.pop2();
                    break;

                case 5:
                    twoStacks.displayArray();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}