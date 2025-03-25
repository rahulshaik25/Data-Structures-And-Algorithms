import java.util.*;

public class PlusOne {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the large integer as an array:");
        String num = x.nextLine();
        int[] arr = new int[num.length()];

        // Convert the string to an array of digits
        for (int i = 0; i < num.length(); i++) {
            arr[i] = num.charAt(i) - '0'; // Convert character to integer
        }

        // Add one to the number
        int carry = 1; // Start with a carry of 1 (since we're adding 1)
        for (int i = arr.length - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10; // Update the digit
            carry = sum / 10; // Update the carry
        }

        // If there's a carry left, insert it at the beginning
        if (carry != 0) {
            int[] newArr = new int[arr.length + 1];
            newArr[0] = carry;
            for (int i = 0; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            arr = newArr;
        }

        // Print the result
        System.out.print("Result after adding one: ");
        for (int digit : arr) {
            System.out.print(digit);
        }
    }
}