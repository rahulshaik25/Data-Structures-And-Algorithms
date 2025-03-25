import java.util.*;

class checkPath
{
    Scanner x = new Scanner(System.in);
   void check()
   {
        System.out.println("Enter the path");
        String path = x.nextLine();
        String[] arraypath = path.split("/");
        System.out.println(Arrays.toString(arraypath));

        Stack<String> s = new Stack<>();
        for(int i =0; i<arraypath.length; i++)
        {
            if(arraypath[i].equals(".."))
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else if (!arraypath[i].equals(".") && !arraypath[i].isEmpty())  // Skip current directory (.) and empty strings
            {
                s.push(arraypath[i]);
            }

        }

        StringBuilder ss= new StringBuilder();
        for(int i =0; i<s.size();i++)
        {
            ss.append("/").append(s.get(i));
        }

        System.out.println(ss);
   }

}
public class Path 
{
    public static void main(String args[])
    {
        checkPath c = new checkPath();
        c.check();
    }
}
