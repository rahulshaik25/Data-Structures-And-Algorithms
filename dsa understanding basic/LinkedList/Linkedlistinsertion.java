import java.util.*;

class Node {
    int input;
    Node address;

    Node(int input) 
    {
        this.input = input;
        this.address = null; // Initialize the address as null
    }
}

class Input {
    Scanner x = new Scanner(System.in);
    Node head = null;// Class-level variable to maintain the head of the list
    int countval;
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

    // Insertion method to insert a new node at a given index
    void insertion() {
        System.out.println("Enter the index where you want to insert the integer:");
        int index = x.nextInt();
        
        // Prompt the user for the value to be inserted
        System.out.println("Enter the number you want to insert:");
        int newValue = x.nextInt();
        
        // Create the new node with the input value
        Node newNode = new Node(newValue);

        // Handle insertion at the head (index 0)
        if (index == 0) {
            newNode.address = head;
            head = newNode;
            return;
        }

        Node current = head;
        int count = 0;

        // Traverse the list to find the (index - 1)th node
        while (current != null && count < index - 1) {
            current = current.address;
            count++;
        }

        // Check if the position is valid (if current is null, the index is out of bounds)
        if (current == null) {
            System.out.println("Index is out of bounds. Cannot insert.");
            return;
        }

        // Insert the new node at the given index
        newNode.address = current.address;
        current.address = newNode;
    }

    void deletion() {
        // Check if the list is empty
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
    
        // Ask for the index of the node to delete
        System.out.println("Enter the index of the element you want to delete:");
        int delIndex = x.nextInt();
    
        // Case: Deleting the head node
        if (delIndex == 0) {
            if (head != null) {
                head = head.address;  // Move head to the next node
                System.out.println("Head node deleted successfully.");
                return;
            }
        }
    
        // Case: Deleting a node other than the head node
        Node current = head;
        int count = 0;
    
        // Traverse to the node just before the one to delete
        while (current != null && count < delIndex - 1) {
            current = current.address;  // Move to the next node
            count++;
        }
    
        // Check if the current is null or if there is no node to delete at delIndex
        if (current == null || current.address == null) {
            System.out.println("Invalid index. The node cannot be deleted.");
            return;
        }
    
        // Remove the node at delIndex by adjusting the previous node's address
        current.address = current.address.address; // Skip the node to delete
    
        // Confirm deletion
        System.out.println("Node at index " + delIndex + " deleted successfully.");
    }

        void countnodes()
        {
            // logic for checking how many nodes in the linked list 

            
             countval = 0;
            if( head== null )
            {
                System.out.println(" There are zero elemnts in this list");
                return;
            }

            Node current= head;

            while(current!=null)
            {
                countval++;
                current= current.address;
                
            }
            System.out.println("There are " + countval + " elements in the list");
            
        }

        void checkvalue()
        {
            /* logic for checking if the element exists in the linked list and print it in which
             position it exits*/

             System.out.println("Enter the value u want to check ");
             int checkval = x.nextInt();
              
             int counter = 0;
             Node current = head;
             while( current != null )
             {
                if(checkval == current.input)
                {
                    System.out.println(" The value is in the linked list ");
                    System.out.println("The index of the element is" +counter );
                    return;
                }

                current= current.address;
                counter++;

             }

             System.out.println("The value is not found in the linked list.");
        }

        void MidElement() {
            // Check if the list is empty
            if (head == null) {
                System.out.println("The list is empty");
                return;
            }
        
            // Count the total number of nodes
            int countval = 0;
            Node current = head;
            while (current != null) {
                countval++;
                current = current.address;
            }
        
            // Calculate the middle index
            int midval = countval / 2;
        
            // Find the middle element
            current = head; // Reset the pointer to the head
            int counter = 0;
            while (current != null) {
                if (counter == midval) {
                    System.out.println("The middle element is: " + current.input);
                    return;
                }
                current = current.address;
                counter++;
            }


            // Chatgpt code given with another easy method to find midelement(here uses single traversal)

            /*
             *void MidElement() {
                     // Handle the case where the list is empty
                        if (head == null) {
                            System.out.println("The linked list is empty. No middle element.");
                         return;
                     }

                      // Use two-pointer approach to find the middle element in a single traversal
                     Node slow = head; // Moves one step at a time
                     Node fast = head; // Moves two steps at a time
                            
                        while (fast != null && fast.address != null) {
                            slow = slow.address; // Move slow pointer one step
                            fast = fast.address.address; // Move fast pointer two steps
                        }
                            
                        // When fast reaches the end, slow is at the middle
                        System.out.println("The middle element is: " + slow.input);
                    }

        */
        }
        
        void CheckCycle() {
            // If the list is empty or has only one element, there's no cycle
            if (head == null || head.address == null) {
                System.out.println("The list is empty or has only one element, no cycle.");
                return; // No cycle in the list
            }
        
            Node slow = head;
            Node fast = head;
        
            while (fast != null && fast.address != null) {
                slow = slow.address; // Move slow pointer by 1 step
                fast = fast.address.address; // Move fast pointer by 2 steps
                
                if (slow == fast) {
                    System.out.println("Cycle detected.");
                    return; // Cycle found
                }
            }
        
            System.out.println("No cycle detected.");
        }
        
        void addnum()
        {
            System.out.println(" Enter the index of the numbers u want to add in Linked list");

            

            System.out.println("The sum is " );
        }
        
    }

public class Linkedlistinsertion {
    public static void main(String args[]) {
        Input list = new Input();
        list.inputTaking(); // Input elements for the linked list
        list.display(); // Display the original list
        list.countnodes();
        list.insertion(); // Insert a new element
        list.display(); // Display the updated list
        list.countnodes(); // no of nodes in linkedlist
        list.deletion(); // delete a node
        list.display(); // display nodes in linked list
        list.countnodes(); 
        list.checkvalue(); // checks if the integer present in linked list
        list.MidElement(); // checks anr displays the middle element
        list.CheckCycle(); // checks if there is any cycle existing in the linkedlist causing infinete loop
    }
}
