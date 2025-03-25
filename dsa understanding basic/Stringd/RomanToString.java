import java.util.*;
public class RomanToString {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Roman Number");
        String Roman = x.nextLine();
        Roman = Roman.toUpperCase();
        char[] arr = Roman.toCharArray();
        HashMap<Character, Integer> RomanVal = new HashMap<>();

        RomanVal.put('I', 1);
        RomanVal.put('V', 5);
        RomanVal.put('X', 10);
        RomanVal.put('L', 50);
        RomanVal.put('C', 100);
        RomanVal.put('D', 500);
        RomanVal.put('M', 1000);

        int sum = RomanVal.get(arr[0]); // Initialize sum with the first character's value

        for (int i = 1; i < arr.length; i++) { 
            if (RomanVal.get(arr[i - 1]) < RomanVal.get(arr[i])) { 
                sum += RomanVal.get(arr[i]) - 2 * RomanVal.get(arr[i - 1]); // ✅ Fix: Correct formula
            } else {
                sum += RomanVal.get(arr[i]);
            }
        }

        System.out.println("Integer Value: " + sum);
    }
}
