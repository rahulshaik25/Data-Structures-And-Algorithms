import java.util.*;
//Count the number of words in a string

class wordsInString
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = x.nextLine();
        String [] arr  = s.split("\\s+");
        System.out.println(Arrays.toString(arr));

        int count=0;
        for(int i=0; i<arr.length;i++)
        {
            count++;
        }
        System.out.println(count);
    }
}