import java.util.*;
//Capitalize First Letter of Each Word in sentence
public class Capitalise 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        String sentence = x.nextLine();
        String [] arr = sentence.split("\\s+");

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].length()>0)
            {
                 arr[i]=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase();
            }
        }
        String result = String.join(" ", arr);
        
        // Output the result
        System.out.println(result);
    }
}
