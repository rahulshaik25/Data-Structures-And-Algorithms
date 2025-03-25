import java.util.*;

// Class for Linked List Nodes
class Node {
    int input;
    Node address;

    Node(int input) {
        this.input = input;
        this.address = null;
    }
}

// Class to handle Linked List operations
class LinkedListOperations {
    Node head = null; // Head of the linked list

    // Method to take input and add nodes to the list
    void takeInput() {
        Scanner x = new Scanner(System.in); // Renamed scanner to x
        System.out.println("Enter elements for the linked list (-1 to stop):");

        while (true) {
            int input = x.nextInt(); // Changed data to input
            if (input == -1) {
                break; // Stop input on -1
            }

            Node newNode = new Node(input); // Changed data to input
            if (head == null) {
                head = newNode; // If list is empty, set head to the new node
            } else {
                Node current = head;
                while (current.address != null) { // Traverse to the last node
                    current = current.address;
                }
                current.address = newNode; // Link the new node to the end of the list
            }
        }
    }

    // Method to display the linked list
    void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.println("Linked list elements:");
        while (current != null) {
            System.out.print(current.input + " -> "); // Changed data to input
            current = current.address;
        }
        System.out.println("null"); // Indicate end of the list
    }

    void cloneList()
    {
        
    }
}

public class CloneLinkedList {
    public static void main(String args[]) {
        LinkedListOperations list = new LinkedListOperations();

       
        list.takeInput();
        list.display();
    }
}
