import java.util.*;

class Node {
    int input;
    Node address;

    Node(int input) {
        this.input = input;
        this.address = null; // Initialize the address as null
    }
}

    class Check {
    Node head = null; // Head of the linked list

    // Method to take input and add nodes to the list
    void inputtake() {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter data for the node (Enter -1 to stop):");
        while (true) {
            int data = x.nextInt();

            if (data == -1) {
                break; // Stop input if user enters -1
            }

            // Create a new node with the input data
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode; // If the list is empty, set head to the new node
            } else {
                Node current = head;
                // Traverse to the last node
                while (current.address != null) {
                    current = current.address;
                }
                // Link the last node to the new node
                current.address = newNode;
            }
        }
    }

    // Method to display the linked list
    void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head; // Start from the head
        while (current != null) {
            System.out.print(current.input + " -> "); // Print node data
            current = current.address; // Move to the next node
        }
        System.out.println("null"); // Indicate end of the list
    }

    // Method to check if the linked list is a palindrome
    boolean isPalindrome() {
        if (head == null) {
            return true; // Empty list is considered a palindrome
        }

        // Step 1: Use a stack to store the elements of the list
        Stack<Integer> stack = new Stack<>();
        Node current = head;
        while (current != null) {
            stack.push(current.input); // Push each element to the stack
            current = current.address;
        }

        // Step 2: Traverse the list again and check if elements match the stack
        current = head;
        while (current != null) {
            if (current.input != stack.pop()) {
                return false; // If any element doesn't match, it's not a palindrome
            }
            current = current.address;
        }

        return true; // If all elements match, it is a palindrome
    }
}

public class PalindromeCheck {
    public static void main(String[] args) {
        Check list = new Check(); // Correct class name used here
        list.inputtake(); // Input elements for the linked list
        list.displayList(); // Display the original list

        // Check if the linked list is a palindrome
        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
