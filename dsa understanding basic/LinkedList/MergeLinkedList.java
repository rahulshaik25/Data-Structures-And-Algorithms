import java.util.*;

class Node {
    int input;
    Node address;

    Node(int input) {
        this.input = input;
        this.address = null;
    }
}

class LinkedList {
    Node head; // Class-level variable to store the head of the linked list

    // Method to create a linked list
    void linkedlist(String listName) {
        System.out.println("Enter the input for " + listName + " and -1 to stop taking input:");
        Scanner x = new Scanner(System.in);

        while (true) {
            int input = x.nextInt();
            if (input == -1) {
                break;
            }

            if (head == null) {
                head = new Node(input); // Initialize head for the first element
            } else {
                Node current = head;
                while (current.address != null) {
                    current = current.address; // Traverse to the end of the list
                }
                current.address = new Node(input); // Add the new node at the end
            }
        }
    }

    // Method to display the linked list
    void display(String listName) {
        if (head == null) {
            System.out.println(listName + " is empty.");
            return;
        }
        Node current = head;
        System.out.println(listName + " elements:");
        while (current != null) {
            System.out.print(current.input + " -> ");
            current = current.address;
        }
        System.out.println("null");
    }

    // Static method to merge two linked lists
    static LinkedList mergeLists(LinkedList list1, LinkedList list2) {
        if (list1.head == null) {
            return list2; // If list1 is empty, return list2
        }
        if (list2.head == null) {
            return list1; // If list2 is empty, return list1
        }

        // Traverse to the end of list1
        Node current = list1.head;
        while (current.address != null) {
            current = current.address;
        }

        // Link the last node of list1 to the head of list2
        current.address = list2.head;

        return list1; // Return the merged list
    }
}

public class MergeLinkedList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Input for the first linked list
        list1.linkedlist("LinkedList1");
        list1.display("LinkedList1");

        // Input for the second linked list
        list2.linkedlist("LinkedList2");
        list2.display("LinkedList2");

        // Merge the two linked lists
        LinkedList mergedList = LinkedList.mergeLists(list1, list2);

        // Display the merged linked list
        mergedList.display("Merged LinkedList");
    }
}
