import java.util.*;
public class StringWithOnlyInt 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the String with only ints or whatever the fuck you want");
        String s = x.nextLine();

        char [] arr= s.toCharArray();
        int count =0;
        for(int i=0; i<arr.length; i++)
        {
            if(Character.isDigit(arr[i]))
            {
                count++;    
            }
            
        }

        if (count == arr.length) 
        {
            System.out.println("The string contains only integers.");
        } 
        else 
        {
            System.out.println("The string contains other characters.");
        }

        
    }    
}
