import java.util.*;

public class InversionsInArray {
    int inversionCount = 0; // Variable to track inversion count

    void mergesort(ArrayList<Integer> a) {
        if (a.size() <= 1) {
            return; // Base case: if the array has 1 or 0 elements, it is already sorted
        }

        int n = a.size() / 2;
        ArrayList<Integer> left = new ArrayList<>(a.subList(0, n));
        ArrayList<Integer> right = new ArrayList<>(a.subList(n, a.size()));

        // Recursively sort the left and right halves
        mergesort(left);
        mergesort(right);

        // Merge the sorted halves and count inversions
        merge(left, right, a);
    }

    void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> a) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                a.set(k, left.get(i));
                i++;
            } else {
                a.set(k, right.get(j));
                j++;
                // Count inversions: all remaining elements in left are greater than right[j]
                inversionCount += (left.size() - i);
            }
            k++;
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

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        InversionsInArray obj = new InversionsInArray();

        ArrayList<Integer> a = new ArrayList<>();
        System.out.println("Enter the elements in the array and -1 to stop:");
        
        while (true) {
            int in = x.nextInt();
            if (in == -1) {
                break;
            }
            a.add(in);
        }

        obj.mergesort(a);

        System.out.println("Sorted Array: " + a);
        System.out.println("Number of inversions: " + obj.inversionCount);
    }
}
