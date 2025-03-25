// 6. Smallest Difference between Two Arrays
// Given two arrays, find the pair (a, b) (where a is from the first array and b is from the second array) such that the absolute difference |a - b| is minimized. Use a Merge Sort-based approach for efficient computation.

// Input:
// arr1 = [1, 3, 15, 11, 2], arr2 = [23, 127, 235, 19, 8]

// Output:
// Pair with smallest difference: (11, 8)
import java.util.*;
public class SmallestDifference 
{
    void merge(ArrayList<Integer> a,ArrayList<Integer> b)
    {
        int n = a.size()+b.size();
        int[] arr = new int[n];
        int i=0,j=0,k=0;
        while(i<a.size() && j<b.size())
        {
           if(a.get(i)<b.get(j))
           {
            arr[k]= a.get(i);
            i++;
           }
           else if(a.get(i)>b.get(j))
           {
            arr[k]= b.get(j);
            j++;
           }
            k++;
        }
        while(i<a.size())
        {
           if(a.get(i)<b.get(j))
           {
            arr[k]= a.get(i);
            i++;
           }
            k++;
        }

        while( j<b.size())
        {
           if(a.get(i)>b.get(j))
           {
            arr[k]= b.get(j);
            j++;
           }
            k++;
        }

        diff(arr);
    }

    void diff(int[] arr)
    {
        int smalldiff= Integer.MAX_VALUE;
        int dif;
        int pair1=0;
        int pair2=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                if(i !=j)
                {
                    dif = arr[i]-arr[j];
                    if(dif<smalldiff)
                    {
                        smalldiff= dif;
                         pair1= arr[i];
                         pair2=arr[j];
                    }
                }
               
            }
        }

        System.out.println("The smallest difference is" +smalldiff +"and the pair are" +pair1 +pair2);
    }
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println("Enter the elements into the array (-1 to stop):");

        // Input elements into the ArrayList
        while (true) {
            int in = x.nextInt();
            if (in == -1) {
                break;
            }
            a.add(in);
        }
        System.out.println("Enter the elements into the 2nd array (-1 to stop):");

        // Input elements into the ArrayList
        while (true) {
            int in = x.nextInt();
            if (in == -1) {
                break;
            }
            b.add(in);
        }

        SmallestDifference d = new SmallestDifference();
       d. merge(a,b);
       

    }
}
