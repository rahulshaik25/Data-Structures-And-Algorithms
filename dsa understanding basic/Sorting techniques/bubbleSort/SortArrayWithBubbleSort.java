// Sort an Array Using Bubble Sort

// Write a program to sort an array of integers in ascending order using the Bubble Sort algorithm.

// Example Input: [5, 3, 8, 6, 2]

// Example Output: [2, 3, 5, 6, 8]

import java.util.*;

public class SortArrayWithBubbleSort {
    // Bubble Sort method
    void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of the array:");
        int n = x.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }

        // Display the original array
        System.out.println("Elements in the array before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sort the array
        SortArrayWithBubbleSort sorter = new SortArrayWithBubbleSort();
        sorter.bubbleSort(arr);

        // Display the sorted array
        System.out.println("Elements in the array after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
