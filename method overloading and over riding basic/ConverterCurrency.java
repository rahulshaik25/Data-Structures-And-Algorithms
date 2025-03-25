/*Write a class `CurrencyConverter` with overloaded methods `convert()`.
 The method should handle different types of currency conversions, 
including USD to INR, EUR to INR, and GBP to INR, and should handle both double and integer inputs. */

// 1 euro is 92.77 inr and 
import java.util.*;
class CurrencyConverter
{
    Scanner x = new Scanner(System.in);
    public void convert()
    {
        

    }
}

class usd extends CurrencyConverter
{
    @Override
    public void convert()
    {
        System.out.println("Enter the usd to convert to inr ");
        int usd = x.nextInt();
        double urs = 83.94*usd;
        System.out.println("The dollars in rupees is "+urs);
    }
}

class euro extends CurrencyConverter
{
    @Override
    public void convert()
    {
        System.out.println("Enter the Euro to convert to inr ");
        int eur = x.nextInt();
        double ers= 92.75* eur;
        System.out.println("The euros in rupees is "+ers);
    }

}

class pound extends CurrencyConverter
{
    @Override
    public void convert()
    {
        System.out.println("Enter the pound to convert to inr ");
        int gbp = x.nextInt();
        double prs = 111.30 * gbp; 
        System.out.println("The pounds in rupees is "+prs);
    }
}

class ConverterCurrency
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        CurrencyConverter C = null;
        System.out.println("in which Currency u wanrt to convert to inr 1- Euro 2-USD 3-Pound");
        int arg = x.nextInt();
        switch (arg) {
            case 1:
            C = new euro();
                break;
            case 2:
            C = new usd();
                break;
            case 3:
            C = new pound();
                break;
            default:
                break;
        }
        C.convert();
    }
}