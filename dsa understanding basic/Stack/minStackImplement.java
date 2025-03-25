import java.util.*;

class MinStack {
    // Stack to store all elements
    private Stack<Integer> intStack;
    // Stack to store the current minimums
    private Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        intStack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push an element onto the stack
    public void push(int val) {
        intStack.push(val);

        // If the minStack is empty or the current value is less than or equal to the current minimum, push it onto minStack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    // Pop the top element from the stack
    public void pop() {
        // If the element being popped is the current minimum, pop from the minStack as well
        if (intStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        intStack.pop();
    }

    // Get the minimum element from the stack
    public int getMin() {
        return minStack.peek(); // The top of the minStack is always the minimum
    }
}

public class minStackImplement {
    public static void main(String args[]) {
        MinStack minStack = new MinStack();
        Scanner scanner = new Scanner(System.in);
        int value;

        System.out.println("Enter integers to push onto the stack. Enter -1 to stop.");
        
        while (true) {
            System.out.print("Enter value: ");
            value = scanner.nextInt();
            
            if (value == -1) {
                break;  // Exit the loop when -1 is entered
            }
            
            minStack.push(value);  // Push the entered value to the stack
        }

        // Perform actions after receiving input
        System.out.println("\nCurrent Minimum Element: " + minStack.getMin());

        // Let's pop a few elements and print the minimum after each pop
        while (!minStack.isEmpty()) {
            minStack.pop();  // Pop one element
            if (!minStack.isEmpty()) {
                System.out.println("Current Minimum Element after pop: " + minStack.getMin());
            } else {
                System.out.println("Stack is empty now.");
            }
        }

        scanner.close();
    }
}
