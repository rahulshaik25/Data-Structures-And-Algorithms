import java.util.*;
//Count the occurrences of a given character in a string.

public class Occurences 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = x.nextLine();
        char[] array = s.toCharArray();
        System.out.println("Enter the character u wanna check the count ");
        char c = x.next().charAt(0);
        

        int count =0;
        for(int i=0; i<array.length;i++)
        {
            if(array[i]==c)
            {
                count++;
            }
        }

        System.out.println("The count of the letter is " +count);
       
    }    
}
