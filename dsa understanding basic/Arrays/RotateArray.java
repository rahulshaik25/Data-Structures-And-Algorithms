// //rotate arrays

// import java.util.*;

// class rotateOperation {
//     public void rotate(int[] array, int k) {
//         int n = array.length;

//         // Adjust k to avoid unnecessary rotations
//         k = k % n;

//         // Split the array into two parts
//         int[] firstPart = Arrays.copyOfRange(array, 0, n - k);
//         int[] secondPart = Arrays.copyOfRange(array, n - k, n);

//         // Concatenate secondPart and firstPart using simple for loops
//         int[] rotatedArray = new int[n];
//         int index = 0;

//         // Add elements from secondPart to rotatedArray
//         for (int i = 0; i < secondPart.length; i++) {
//             rotatedArray[index] = secondPart[i];
//             index++;
//         }

//         // Add elements from firstPart to rotatedArray
//         for (int i = 0; i < firstPart.length; i++) {
//             rotatedArray[index] = firstPart[i];
//             index++;
//         }

//         // Print the rotated array using a simple for loop
//         System.out.println("The array after shifted is:");
//         for (int i = 0; i < rotatedArray.length; i++) {
//             System.out.println(rotatedArray[i]);
//         }
//     }
// }

// public class RotateArray {
//     public static void main(String[] args) {
//         Scanner x = new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int n = x.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter the array input");
//         for (int i = 0; i < n; i++) {
//             arr[i] = x.nextInt();
//         }

//         System.out.println("Array input data is:");
//         for (int i = 0; i < n; i++) {
//             System.out.println(arr[i]);
//         }

//         System.out.println("Enter the number of positions you want to shift for the first element");
//         int k = x.nextInt();

//         rotateOperation r = new rotateOperation();
//         r.rotate(arr, k);

//         x.close(); // Close the scanner
//     }
// }
import java.util.Arrays;

public class RotateArray {

    // Function to rotate the array to the right by k positions
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  // In case k is greater than array length
        
        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        
        // Step 3: Reverse the remaining elements
        reverse(arr, k, n - 1);
    }

    // Helper function to reverse the array from index start to end
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main function to test the rotation
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Rotate by 3 positions
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        rotateArray(arr, k);  // Rotate the array
        
        System.out.println("Array after rotation: " + Arrays.toString(arr));
    }
}
