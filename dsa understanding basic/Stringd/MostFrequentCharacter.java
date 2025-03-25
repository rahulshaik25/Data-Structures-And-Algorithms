import java.util.*;
// aanananananan most freq is a 
public class MostFrequentCharacter {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = x.nextLine();

        HashMap<Character, Integer> h = new HashMap<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        }

        Map.Entry<Character, Integer> mostFrequentEntry = null;

        for (Map.Entry<Character, Integer> entry : h.entrySet()) {
            if (mostFrequentEntry == null || entry.getValue() > mostFrequentEntry.getValue()) {
                mostFrequentEntry = entry;
            }
        }

        if (mostFrequentEntry != null) {
            System.out.println("Most frequent character: " + mostFrequentEntry.getKey());
            System.out.println("Frequency: " + mostFrequentEntry.getValue());
        }
    }
}
