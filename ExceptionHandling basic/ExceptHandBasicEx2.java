import java.util.*;

class ArrayException {
    Scanner x = new Scanner(System.in);
    
    void arrMethod() throws Exception {
        System.out.println("Enter the size of the array:");
        int n = x.nextInt();  
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();  
        }
        
        
        if (n >= 0 && n < arr.length) {
            System.out.println("Accessing element arr[" + n + "]: " + arr[n]);
        } else {
            System.out.println("Error: Array index is out of bounds!");
        }
    } 
}

public class ExceptHandBasicEx2 {
    public static void main(String[] args) throws Exception {
        ArrayException A = new ArrayException();
        A.arrMethod();
    }
}
