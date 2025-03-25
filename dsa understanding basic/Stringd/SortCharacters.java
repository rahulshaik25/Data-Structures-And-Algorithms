// sort characters in a string 
import java.util.*;
public class SortCharacters 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Give the String nigga");
        String str = x.nextLine();
           str= str.toLowerCase();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        
        String sorted = new String(arr);
        System.out.println(sorted);
       
    }
}
