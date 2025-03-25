// 5. Sort Array of Strings by Length
// Sort an array of strings using Merge Sort based on the length of each string. If two strings have the same length, maintain their relative order.

// Input:
// ["apple", "dog", "elephant", "cat"]
// Output:
// ["dog", "cat", "apple", "elephant"]

import java.util.*;

public class MergeSortArrayList {

    // Method to perform merge sort on an ArrayList
    public static void mergeSort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return; // Base case: already sorted
        }

        // Split the ArrayList into two halves
        int mid = arr.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(arr.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    // Method to merge two sorted ArrayLists
    private static void merge(ArrayList<Integer> arr, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right into the main ArrayList
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                arr.set(k++, left.get(i++));
            } else {
                arr.set(k++, right.get(j++));
            }
        }

        // Add remaining elements from the left ArrayList
        while (i < left.size()) {
            arr.set(k++, left.get(i++));
        }

        // Add remaining elements from the right ArrayList
        while (j < right.size()) {
            arr.set(k++, right.get(j++));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // Input from user
        System.out.println("Enter integers for the ArrayList (-1 to stop):");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) { // Stop signal
                break;
            }
            arr.add(input);
        }

        // Print the original ArrayList
        System.out.println("ArrayList before sorting:");
        System.out.println(arr);

        // Perform merge sort
        mergeSort(arr);

        // Print the sorted ArrayList
        System.out.println("ArrayList after sorting:");
        System.out.println(arr);
    }
}

