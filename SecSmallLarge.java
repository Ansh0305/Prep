// Brute force and Optimal Solution for Smallest and Largest Element in the Array

// 1. Brute Force Solution for Smallest Element in the Array
import java.util.Arrays;
class SolutionSL{
    public static void SecSmallLarge(int[] arr, int n){
        // Edege Case
        if(n < 2) {

            System.out.println("Array must contain more than 2 numbers");
            return;
        }
            
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n - 2];
        System.out.println("Second Smallest Element: " + small);
        System.out.println("Second Largest Element: " + large);
    }
}


public class SecSmallLarge {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 0, 1};
        
        int n = arr.length;
    
        SolutionSL.SecSmallLarge(arr, n);
    }
}

// Issue: Can't handle duplicates
