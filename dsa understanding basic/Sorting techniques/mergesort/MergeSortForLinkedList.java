// Implement Merge Sort to sort a singly linked list.

// Input:
// 3 -> 1 -> 4 -> 2 -> 5
// Output:
// 1 -> 2 -> 3 -> 4 -> 5
import java.util.*;

// Definition of Node
class Node {
    int val;
    Node address;

    Node(int input) {
        this.val = input;
        this.address = null;
    }
}

// Class to handle input and operations
class InputHandler {
    // Method to dynamically take input and construct a linked list
    Node inputTake() {
        Scanner x = new Scanner(System.in);
        Node head = null, tail = null;

        System.out.println("Enter linked list values (-1 to stop):");
        while (true) {
            int data = x.nextInt(); // Read input
            if (data == -1) { // Stop when -1 is entered
                break;
            }
            Node newNode = new Node(data); // Create a new node
            if (head == null) { // Initialize head and tail
                head = newNode;
                tail = newNode;
            } else { // Append new node to the end
                tail.address = newNode;
                tail = newNode;
            }
        }
        return head; // Return the head of the linked list
    }
}

// Main class for Merge Sort
public class MergeSortForLinkedList {

    // Method to convert Linked List to ArrayList
    ArrayList<Integer> llToArray(Node head) {
        ArrayList<Integer> al = new ArrayList<>();
        if (head == null) {
            return al; // Return empty ArrayList if list is null
        }
        Node current = head;
        while (current != null) {
            al.add(current.val); // Add each node's value to ArrayList
            current = current.address;
        }
        return al;
    }

    // Method to perform merge sort on ArrayList
    void mergeSort(ArrayList<Integer> a) {
        if (a.size() <= 1) {
            return; // Base case: if the array has 1 or 0 elements, it is already sorted
        }

        // Find the middle index
        int mid = a.size() / 2;

        // Create two sublists
        ArrayList<Integer> left = new ArrayList<>(a.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(a.subList(mid, a.size()));

        // Recursively sort the two sublists
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted sublists
        merge(a, left, right);
    }

    // Method to merge two sorted sublists into the main list
    void merge(ArrayList<Integer> a, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right into the original list
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                a.set(k++, left.get(i++));
            } else {
                a.set(k++, right.get(j++));
            }
        }

        // Add remaining elements from the left sublist
        while (i < left.size()) {
            a.set(k++, left.get(i++));
        }

        // Add remaining elements from the right sublist
        while (j < right.size()) {
            a.set(k++, right.get(j++));
        }
    }

    // Method to print the sorted ArrayList
    void printArrayList(ArrayList<Integer> al) {
        for (int val : al) {
            System.out.print(val + " -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        MergeSortForLinkedList msll = new MergeSortForLinkedList();

        // Take linked list input
        Node head = inputHandler.inputTake();

        // Convert linked list to ArrayList
        ArrayList<Integer> al = msll.llToArray(head);

        System.out.println("ArrayList before sorting:");
        System.out.println(al);

        // Perform merge sort on ArrayList
        msll.mergeSort(al);

        System.out.println("ArrayList after sorting:");
        msll.printArrayList(al);
    }
}
