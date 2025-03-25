import java.util.*;

class Operations 
{
    Scanner x = new Scanner(System.in);
 void ThirdMax(int[] array)
 {
    int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
        
        for (int num : array) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num < first) {
                third = second;
                second = num;
            } else if (num > third && num < second) {
                third = num;
            }
        }
        
        System.out.println("Third largest element is "+third);
 }

 void MajorityElement(int[] array) 
 {
    int size = array.length;
    
    // Iterate over each element in the array
    for (int i = 0; i < size; i++) {
        int count = 0;

        // Count occurrences of array[i]
        for (int j = 0; j < size; j++) {
            if (array[i] == array[j]) {
                count++;
            }
        }

        // Check if the count of the current element is greater than half the array size
        if (count > size / 2) {
            System.out.println(array[i] + " is the Majority Element");
            return; // Exit as soon as majority element is found
        }
    }

    // If no majority element is found after checking all elements
    System.out.println("There is no Majority Element");
}

  void Intersection(int[] array,int[] array2)
  {
    boolean found = false;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array2.length; j++)
            {
                if(array[i]==array2[j])
                {
                    found= true;
                    System.out.println( "The elements same in 2 arrays are "+array[i] + " ");

                    break;
                }               
            }
        } 
  }
  
  void LongestConsecutiveSubsequence(int[] array) 
  {
    // Initialize a HashSet to store unique elements
    HashSet<Integer> lcs = new HashSet<>();
    for (int i = 0; i < array.length; i++) {
        lcs.add(array[i]);
    }

    int LongestStreak = 0;
    HashSet<Integer> LongestSubsequence = new HashSet<>();

    // Loop through each element of the HashSet
    for (int num : lcs) {
        // Check if num is the start of a sequence
        if (!lcs.contains(num - 1)) {
            int currentnum = num;
            int presentStreak = 1;
            HashSet<Integer> PresentSubsequence = new HashSet<>();
            PresentSubsequence.add(currentnum);

            // Count consecutive numbers
            while (lcs.contains(currentnum + 1)) {
                currentnum++;
                presentStreak++;
                PresentSubsequence.add(currentnum);
            }

            // Update the longest subsequence if needed
            if (presentStreak > LongestStreak) {
                LongestStreak = presentStreak;
                LongestSubsequence = new HashSet<>(PresentSubsequence); // Store the new longest subsequence
            }
        }
    }

    // Print the results
    System.out.println("Longest Streak is: " + LongestStreak);
    System.out.println("Longest Subsequence is: " + LongestSubsequence);
    }

    void MaxSumSubArray(int[] array)
    {
        //Kadane's Algorithm 
        int MaxSum=array[0];
        int currentSum = array[0];

        for(int i=1; i<array.length;i++)
        {
            currentSum = Math.max(array[i], currentSum + array[i]);
            MaxSum= Math.max(currentSum,MaxSum);
        }
        
        System.out.println("Maximum Sum of the sub array is:"+MaxSum);
        

    }

    void MoveZero(int[] array)
    {
        //Logic here
        int nonZeroIndex=0;
        for(int i=0; i<array.length;i++)
        {
            if(array[i]!=0)
            {
                array[nonZeroIndex]= array[i];
                nonZeroIndex++;
            }

        }

        for (int i = nonZeroIndex; i < array.length; i++) {
            array[i] = 0;
        }
    }

}


public class ArrayOperations 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = x.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array input");
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }

        System.out.println("Array input data is:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }   
   
        Operations op = new Operations();
        op.ThirdMax(arr);// finds 3rd max element in array
        op.MajorityElement(arr);// finds element present more than half of array
        op.LongestConsecutiveSubsequence(arr);//finds the longest ascending order of elemenst in array
        op.MaxSumSubArray(arr);// finds the max sum that can be got in the sum of subarrays also called as kadane's Algorithm
        op.MoveZero(arr);//Moves zeros in the array to the end ignores otherwise

        System.out.println("Do u want to take another array as an input and check their intersection");
            System.out.println("1- Yes 2-No ");
            int needcheck = x.nextInt();

            switch(needcheck)
            {
                case 1 :
                // for array2
                System.out.println("Enter the size of an array2");
                int n2 = x.nextInt();
                int[] arr2 = new int[n2];

                System.out.println("Enter the array2 input");
                for (int i = 0; i < n2; i++) {
                    arr2[i] = x.nextInt();
                }

                System.out.println("Array2 input data is:");
                for (int i = 0; i < n2; i++) 
                {
                    System.out.println(arr2[i]);
                }
                op.Intersection(arr,arr2);// checks if there are any intersection pts
                break;

                case 2:
                break;

                default:
                break;
            }
  
    }    
    }

