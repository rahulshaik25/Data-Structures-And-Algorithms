import java.util.*;
/*
 * 3. Merge Two Sorted Arrays
Given two sorted arrays, merge them into a single sorted array.

Example Input:
arr1 = [1, 3, 5]
arr2 = [2, 4, 6]
Output:
[1, 2, 3, 4, 5, 6]
 */
public class MergeTwoSortedArrays 
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
        MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
        obj.mergesort(a, b);

    }    
}
