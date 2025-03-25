import java.util.*;

public class SimplePermutation {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = x.nextLine();
        char[] arr=s.toCharArray();
        // Convert string to list of characters
        List<Character> charList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            charList.add(c);
        }

        // Shuffle and print different permutations
        System.out.println("Random Permutations:");
        for (int i = 0; i <arr.length*arr.length ; i++) { // Print 5 different random permutations
            Collections.shuffle(charList);
            for (char c : charList) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
