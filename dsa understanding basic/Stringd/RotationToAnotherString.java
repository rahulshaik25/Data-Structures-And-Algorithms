import java.util.*;
//check rotated array 
public class RotationToAnotherString {
    // Function to perform one left rotation
    public static String rotateleft(String s) { 
        return s.substring(1) + s.charAt(0);
    }

    // Function to check if s2 is a rotation of s1
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;  // Rotation is only possible if lengths are the same
        }

        String rotate = s1;
        for (int i = 0; i < s1.length(); i++) {
            rotate = rotateleft(rotate); // Rotate left by 1

            if (rotate.equals(s2)) {
                return true;  // Match found
            }
        }
        return false;  // No match found after all rotations
    }

    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = x.nextLine();
        System.out.println("Enter the second string:");
        String s2 = x.nextLine();

        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is NOT a rotation of " + s1);
        }

        x.close();  // Close the scanner
    }
}
//2nd and most efficient way to do the code is given below 

/*
 * import java.util.*;

public class RotationToAnotherString {
    // Function to check if s2 is a rotation of s1
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;  // Rotation only possible if lengths are the same
        }
        // Concatenate s1 with itself and check if s2 is a substring
        String doubled = s1 + s1;
        return doubled.contains(s2);
    }

    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = x.nextLine();
        System.out.println("Enter the second string:");
        String s2 = x.nextLine();

        if (isRotation(s1, s2)) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is NOT a rotation of " + s1);
        }

        x.close();  // Close the scanner
    }
}

 */