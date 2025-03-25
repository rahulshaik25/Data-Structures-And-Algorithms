import java.util.*;

public class NextPermutation {
    public static String nextPermutation(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Find first decreasing character from right
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // If already largest permutation, return smallest one
        if (i == -1) {
            Arrays.sort(arr);
            return new String(arr);
        }

        // Find next larger character to swap
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Swap them
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Reverse the right part (simpler than sorting)
        reverse(arr, i + 1, n - 1);

        return new String(arr);
    }

    public static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = x.nextLine();

        System.out.println("Next permutation: " + nextPermutation(s));

        x.close();
    }
}
