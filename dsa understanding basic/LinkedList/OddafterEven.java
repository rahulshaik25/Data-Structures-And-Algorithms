import java.util.*;

class Node { 
    int input; 
    Node adress = null;

    Node(int input) {
        this.input = input;
        this.adress = null; 
    }
}

class InputDisp { 
    Scanner x = new Scanner(System.in);
    Node head = null; // Keep the head as a class-level variable for access

    // Method to take input and add nodes
    void inputt() {
        System.out.println("Enter numbers to add to the linked list (-1 to stop):");
        int data;
        while ((data = x.nextInt()) != -1) { // Stop input when -1 is entered
            if (head == null) {
                head = new Node(data); // Initialize head if list is empty
            } else {
                Node curr = head;
                while (curr.adress != null) { 
                    curr = curr.adress; // Traverse to the end
                }
                curr.adress = new Node(data); // Add new node at the end
            }
        }
    }

    // Method to display the linked list
    void display() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        System.out.println("Linked list elements:");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.input + " -> ");
            curr = curr.adress;
        }
        System.out.println("null");
    }
}

class EvenOdd {
    // Method to print even elements first, followed by odd elements
    void evenodd(Node head) {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }

        Node evenHead = null, oddHead = null;
        Node evenTail = null, oddTail = null;

        Node curr = head;

        // Traverse the list and separate even and odd elements
        while (curr != null) {
            if (curr.input % 2 == 0) {
                if (evenHead == null) {
                    evenHead = new Node(curr.input);
                    evenTail = evenHead;
                } else {
                    evenTail.adress = new Node(curr.input);
                    evenTail = evenTail.adress;
                }
            } else {
                if (oddHead == null) {
                    oddHead = new Node(curr.input);
                    oddTail = oddHead;
                } else {
                    oddTail.adress = new Node(curr.input);
                    oddTail = oddTail.adress;
                }
            }
            curr = curr.adress;
        }

        // Print even elements first
        System.out.print("Even elements: ");
        Node evenCurr = evenHead;
        while (evenCurr != null) {
            System.out.print(evenCurr.input + " ");
            evenCurr = evenCurr.adress;
        }
        System.out.println();

        // Print odd elements next
        System.out.print("Odd elements: ");
        Node oddCurr = oddHead;
        while (oddCurr != null) {
            System.out.print(oddCurr.input + " ");
            oddCurr = oddCurr.adress;
        }
        System.out.println();
    }
}

public class OddafterEven {
    public static void main(String args[]) {
        InputDisp list = new InputDisp();
        list.inputt();  // Takes input and creates the linked list
        list.display(); // Displays the linked list

        EvenOdd eo = new EvenOdd();
        eo.evenodd(list.head);  // Calls the evenodd method to print even first, then odd
    }
}
