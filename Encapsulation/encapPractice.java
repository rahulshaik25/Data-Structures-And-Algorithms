import java.util.Scanner;

class privateClass
{
    private int num1;
    private int num2;
    
    public privateClass (int num1 , int num2 )
    {
        
        this.num1 = num1;
        this.num2= num2;
    }
        public void pclass()
        {
            if(num1> num2)
        {
            System.out.println("The greater number is "+num1);

        }
        else if(num2> num1)
        {
            System.out.println("The greater number is "+num2);
            
        }
        }
        
    
}
public class encapPractice {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        
        System.out.print("Enter first and second number: ");
        int num1= x.nextInt();
        int num2=x.nextInt();
        privateClass pp = new privateClass(num1, num2);
        pp.pclass();

    }
}
