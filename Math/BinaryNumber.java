import java.util.*;
//Convert the number into binary
public class BinaryNumber 
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number to convert in binary");
        int a = x.nextInt();
        StringBuilder s = new StringBuilder();
        while(a!=0)
        {
            int rem =a%2;
            s.append(rem);
            a=a/2;   
        }

        System.out.println(s.reverse().toString());
    }    
}
