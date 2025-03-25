// 7. Sort an Array of Strings
// Write a program to sort an array of strings using Merge Sort.

// Input:
// ["banana", "apple", "cherry", "date"]
// Output:
// ["apple", "banana", "cherry", "date"]
import java.util.*;

public class SortArrayOfStrings {

    // Merge Sort method
    void mergesort(ArrayList<String> a) {
        // Base case to terminate recursion
        if (a.size() <= 1) {
            return;
        }

        int mid = a.size() / 2;

        // Splitting the list into two halves
        ArrayList<String> left = new ArrayList<>(a.subList(0, mid));
        ArrayList<String> right = new ArrayList<>(a.subList(mid, a.size()));

        // Recursive calls to sort the left and right halves
        mergesort(left);
        mergesort(right);

        // Merge the sorted halves
        merge(a, left, right);
    }

    // Merge method to combine two sorted lists
    void merge(ArrayList<String> a, ArrayList<String> left, ArrayList<String> right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right lists and merge them
        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                a.set(k++, left.get(i++));
            } else {
                a.set(k++, right.get(j++));
            }
        }

        // Add any remaining elements from the left list
        while (i < left.size()) {
            a.set(k++, left.get(i++));
        }

        // Add any remaining elements from the right list
        while (j < right.size()) {
            a.set(k++, right.get(j++));
        }
    }

    // Main method to test the program
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Input the list of strings
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        ArrayList<String> strings = new ArrayList<>();
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }

        // Create an object of the class and sort the list
        SortArrayOfStrings sorter = new SortArrayOfStrings();
        sorter.mergesort(strings);

        // Print the sorted list
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}
