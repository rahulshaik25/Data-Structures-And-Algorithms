import java.util.*;

public class BasicHashsetUsage
{
    public static void main(String[] args) 
    {
        HashSet<String> set = new HashSet<>();
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the string inputs for the hashset and write exit to complete the hashset");
        for(int i=0; i<10; i++)
        {
        String in = x.nextLine();
        if(in.equalsIgnoreCase("exit"))
        {
            break;
        }
        set.add(in); 
        
        }
        System.out.println("HashSet contains: " + set); 
    }
}
