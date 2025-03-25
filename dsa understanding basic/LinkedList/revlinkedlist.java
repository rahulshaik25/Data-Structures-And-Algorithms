import java.util.*;

class Node {
    int input;
    Node address;

    Node(int input) {
        this.input = input;
        this.address = null; // Initialize the address as null
    }
}

class Input {
    Scanner x = new Scanner(System.in);
    Node head = null; // Class-level variable to maintain the head of the list

    // Method to take input for the linked list
    void inputTaking() {
        System.out.println("Enter elements for the linked list (-1 to stop):");
        while (true) {
            int data = x.nextInt(); // Take input
            if (data == -1) { // Stop input on -1
                break;
            }

            if (head == null) {
                head = new Node(data); // Create the head node if the list is empty
            } else {
                Node current = head;
                while (current.address != null) { // Traverse to the last node
                    current = current.address;
                }
                current.address = new Node(data); // Link the new node at the end
            }
        }
    }

    // Method to display the linked list
    void display() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        Node current = head;
        System.out.println("Linked list elements:");
        while (current != null) {
            System.out.print(current.input + " -> ");
            current = current.address;
        }
        System.out.println("null");
    }

    // Method to reverse the linked list
    void reverseList() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.address; 
            current.address = prev; 
            prev = current;         
            current = next;       
        }

        head = prev; 
    }
}

public class revlinkedlist {
    public static void main(String args[]) {
        Input list = new Input();
        list.inputTaking(); 
        System.out.println("Original Linked List:");
        list.display(); 
        
        list.reverseList();
        System.out.println("Reversed Linked List:");
        list.display(); 
    }
}
