import java.util.*;
// 10. Find the Median of Two Sorted Arrays
// Given two sorted arrays of size m and n, find the median of the combined arrays.

// Example Input:
// arr1 = [1, 3, 8], arr2 = [7, 9, 10, 11]
// Output:
// Median = 8.0
public class MedianOfArrays 
{
    void mergesort(int[] a ,int[] b)
    {
        int p = a.length+b.length;
        int[] c = new int[p];

        int i=0, j=0,k=0;

        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                c[k++]=a[i++];
            }
            else if(a[i]>b[j])
            {
                c[k++]=b[j++];
            }
        }

        while(i<a.length )
        {
            if(a[i]<b[j])
            {
                c[k++]=a[i++];
            }
        }

        while( j<b.length)
        {
             if(a[i]>b[j])
            {
                c[k++]=b[j++];
            }
        }
        System.out.println("Merged Array: " + Arrays.toString(c));
        double median = median(c);
        System.out.println(median);
        
    }
    public static double median (int[] c)
    {
        int n = c.length;
        int m = n/2;
        if(n%2 ==1)
        {
            return c[m/2];
        }
        else
        {
            return (c[n / 2 - 1] + c[n / 2]) / 2.0;
        }
    }
    public static void main (String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n = x.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter the size of second array");
        int m = x.nextInt();
        int[] b = new int[n];
        for(int i=0; i<n; i++)
        {
            b[i]=x.nextInt();
        }
        Arrays.sort(b);
        MedianOfArrays obj = new MedianOfArrays();
        obj.mergesort(a, b);
        

    }    
}  

