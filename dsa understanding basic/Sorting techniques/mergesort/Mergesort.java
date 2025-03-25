import java.util.ArrayList;
import java.util.Scanner;

class Mergesort {
    // Method to perform merge sort
    void mergeSort(ArrayList<Integer> a) {
        if (a.size() <= 1) {
            return; // Base case: if the array has 1 or 0 elements, it is already sorted
        }

        // Find the middle index
        int mid = a.size() / 2;

        // Create two sublists
        ArrayList<Integer> left = new ArrayList<>(a.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(a.subList(mid, a.size()));

        // Recursively sort the two sublists
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted sublists
        merge(a, left, right);
    }

    // Method to merge two sorted sublists into the main list
    void merge(ArrayList<Integer> a, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from left and right into the original list
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                a.set(k++, left.get(i++));
            } else {
                a.set(k++, right.get(j++));
            }
        }

        // Add remaining elements from the left sublist
        while (i < left.size()) {
            a.set(k++, left.get(i++));
        }

        // Add remaining elements from the right sublist
        while (j < right.size()) {
            a.set(k++, right.get(j++));
        }
    }

    public static void main(String args[]) {
        Mergesort m = new Mergesort();
        Scanner x = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Enter the elements into the array (-1 to stop):");

        // Input elements into the ArrayList
        while (true) {
            int in = x.nextInt();
            if (in == -1) {
                break;
            }
            a.add(in);
        }

        // Perform merge sort
        System.out.println("Original Array: " + a);
        m.mergeSort(a);
        System.out.println("Sorted Array: " + a);

        x.close(); // Close the scanner
    }
}
