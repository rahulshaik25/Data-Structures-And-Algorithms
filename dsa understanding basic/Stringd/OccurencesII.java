import java.util.HashMap;

public class OccurencesII {
    public static void main(String[] args) {
        String str = "hello world"; // Input string
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Traverse the string
        for (char ch : str.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                // Increment the count if the character already exists
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // Add the character with a count of 1
                charCountMap.put(ch, 1);
            }
        }

        // Display the character counts
        for (char key : charCountMap.keySet()) {
            System.out.println(key + ": " + charCountMap.get(key));
        }
    }
}
