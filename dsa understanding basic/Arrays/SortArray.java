// take 2 array input and merge ad then sort it 
 import java.util.*;
 class merge
 {
     Scanner x = new Scanner(System.in);
     void arrays()
     {
         //Size for the first array
         System.out.println("Enter input size for array1 ");
         int m = x.nextInt();
         
         int[] num1 = new int[m];
         //Size for the second array
         System.out.println("Enter input size for array2 ");
          int n = x.nextInt();
          
         int[] num2 = new int[n];
 
         //taking input for array1
         System.out.println("Enter input for array1 ");
         for(int i=0; i<m;i++)
         {
             num1[i]= x.nextInt();
         }
 
         //taking input for array2
         System.out.println("Enter input for array2 ");
         for(int i=0; i<n;i++)
         {
             num2[i]= x.nextInt();
         }

         // Display the array
         System.out.println(" input of array1 ");
         for(int i=0; i<m; i++)
         {
            System.out.println(num1[i]);
         }
         System.out.println(" input of array2 ");
         for(int i=0; i<n; i++)
         {
            System.out.println(num2[i]);
         }
          sortarray(num1);
          sortarray(num2);

          System.out.println("Sorted array1: ");
          for(int i=0; i<m; i++) {
              System.out.print(num1[i] + " ");
          }
          System.out.println();
          
          System.out.println("Sorted array2: ");
          for(int i=0; i<n; i++) {
              System.out.print(num2[i] + " ");
          }
          System.out.println();
          
          int k = m +n;
          int arr[] = new int[k];
          for(int i =0; i<m;i++)
          {
            arr[i]= num1[i];
          }
          for(int j=0; j<n;j++)
          {
            arr[m+j]= num2[j];
          }
          
          System.out.println("merged array");
          for(int l=0;l<k-1;l++)
          {
            System.out.println(arr[l]);
          }

          sortarray(arr);
          
          for(int i=0; i<k;i++)
          {
            System.out.print( arr[i]+" ");
          }
    
    }
    
    void sortarray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

        // remove duplicates ig

        // Remove duplicates in-place
    int index = 0; // Index to place the next unique element
    for (int i = 1; i < n; i++) {
        if (array[i] != array[index]) {
            index++;
            array[index] = array[i];
        }
    }

    // Reduce the array size by filling unused spaces with a sentinel value (e.g., 0 or Integer.MIN_VALUE)
    for (int i = index + 1; i < n; i++) {
        array[i] = Integer.MIN_VALUE; // Mark unused slots, optional
    }
}
    }
    
 
 class SortArray
 {
     public static void main(String args[])
     {
        merge M = new merge();
        M.arrays();
     }
 }
 
 
