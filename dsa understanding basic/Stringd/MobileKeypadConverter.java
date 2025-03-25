import java.util.*;

public class MobileKeypadConverter {
    public static void main(String[] args) {
        // Step 1: Create HashMap for character-to-keypad mapping
        HashMap<Character, String> keypadMap = new HashMap<>();
        
        // Key mappings for each character
        keypadMap.put('A', "2");    keypadMap.put('B', "22");   keypadMap.put('C', "222");
        keypadMap.put('D', "3");    keypadMap.put('E', "33");   keypadMap.put('F', "333");
        keypadMap.put('G', "4");    keypadMap.put('H', "44");   keypadMap.put('I', "444");
        keypadMap.put('J', "5");    keypadMap.put('K', "55");   keypadMap.put('L', "555");
        keypadMap.put('M', "6");    keypadMap.put('N', "66");   keypadMap.put('O', "666");
        keypadMap.put('P', "7");    keypadMap.put('Q', "77");   keypadMap.put('R', "777"); keypadMap.put('S', "7777");
        keypadMap.put('T', "8");    keypadMap.put('U', "88");   keypadMap.put('V', "888");
        keypadMap.put('W', "9");    keypadMap.put('X', "99");   keypadMap.put('Y', "999"); keypadMap.put('Z', "9999");
        keypadMap.put(' ', "0"); // Space is mapped to "0"

        // Step 2: Take input string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine().toUpperCase(); // Convert to uppercase

        // Step 3: Convert the string to numeric keypad sequence
        StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (keypadMap.containsKey(ch)) {
                output.append(keypadMap.get(ch)); // Get the mapped sequence from HashMap
            }
        }

        // Step 4: Print the result
        System.out.println("Keypad Sequence: " + output.toString());
    }
}
