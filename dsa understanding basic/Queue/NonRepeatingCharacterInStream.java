import java.util.*;

public class NonRepeatingCharacterInStream {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Queue<Character> q = new ArrayDeque<>();
        HashMap<Character, Integer> h = new HashMap<>();

        System.out.println("Enter the stream of characters (type '0' to stop):");

        while (true) {
            char c = x.next().charAt(0); // Read a character
            if (c == '0') { // Stop condition
                break;
            }

            // Add character to the queue
            q.add(c);

            // Update the frequency in the HashMap
            h.put(c, h.getOrDefault(c, 0) + 1);

            // Process the queue to find the first non-repeating character
            while (!q.isEmpty() && h.get(q.peek()) > 1) {
                q.poll(); // Remove repeating characters from the front
            }

            // Output the first non-repeating character or indicate none
            if (!q.isEmpty()) {
                System.out.println("First non-repeating character: " + q.peek());
            } else {
                System.out.println("No non-repeating character found.");
            }
        }

        x.close();
    }
}
