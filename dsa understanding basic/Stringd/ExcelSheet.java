//Convert a number to Excel column name (e.g., 28 → AB).
import java.util.*;
public class ExcelSheet 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = x.nextInt();
            
            StringBuilder sb = new StringBuilder();
        
            while(n>0)
            {
                int rem = (n-1)%26;
                sb.append((char)('A'+rem));
                n = (n-1)/26;
            }
        System.out.println("The ExcelSheet Name is : " + sb.reverse().toString());
    }
}
