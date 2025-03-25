
import java.util.*;


class Node {
    int input;    
    Node next;    

    // Constructor to initialize the node
    Node(int input) {
        this.input = input;
        this.next = null;
    }
}

// LinkedListpractice class: Manages the linked list operations
public class LinkedListpractice {
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
                while (current.next != null) {
                    current = current.next;
                }
                // Link the last node to the new node
                current.next = newNode;
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
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // Indicate end of the list
    }

    public static void main(String[] args) {
        LinkedListpractice list = new LinkedListpractice(); 
        list.inputtake(); 
        list.displayList(); 
    }
}


