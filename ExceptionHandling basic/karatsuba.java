import java.util.*;

class Karat {
    public static long karatsubaMultiply(long x, long y) {
        // Base case for small numbers
        if (x < 10 || y < 10) {
            return x * y;
        }

        // Calculate the size of the numbers
        int maxLength = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int half = maxLength / 2;

        // Split the digit sequences into high and low parts
        long a = x / (long) Math.pow(10, half);  // High part of x
        long b = x % (long) Math.pow(10, half);  // Low part of x
        long c = y / (long) Math.pow(10, half);  // High part of y
        long d = y % (long) Math.pow(10, half);  // Low part of y

        // Recursively calculate ac, bd, and (a+b)(c+d)
        long ac = karatsubaMultiply(a, c);
        long bd = karatsubaMultiply(b, d);
        long adbc = karatsubaMultiply((a + b), (c + d)) - ac - bd;

        // Combine the results
        return (long) (ac * Math.pow(10, 2 * half) + adbc * Math.pow(10, half) + bd);
    }
}

class karatsuba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers x and y:");
        long x = sc.nextLong();  // Use long for large numbers
        long y = sc.nextLong();

        // Perform Karatsuba multiplication
        long result = Karat.karatsubaMultiply(x, y);
        System.out.println("The product of " + x + " and " + y + " is: " + result);
    }
}
