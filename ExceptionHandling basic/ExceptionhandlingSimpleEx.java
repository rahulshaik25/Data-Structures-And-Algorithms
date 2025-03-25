import java.util.*;

public class ExceptionhandlingSimpleEx 
{
    public static void main(String[] args) 
    {
        Scanner x = new Scanner(System.in);
        class NumberFormatExceptionHandler
        {
            void handle()
            {
                try {
            System.out.println("Enter the number and it will take as a string");
            String str = x.nextLine();
            int num = Integer.parseInt(str);
            System.out.println("The number is "+num);
                }

                catch(NumberFormatException e )
                {
                    System.out.println("Invalid number format ");
                }
            }
            
        }
        NumberFormatExceptionHandler handlerObj = new NumberFormatExceptionHandler();
            handlerObj.handle();
    }
}
