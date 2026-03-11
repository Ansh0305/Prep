// Brute force and Optimal Solution for Smallest and Largest Element in the Array

// 1. Brute Force Solution for Smallest Element in the Array
/* 
import java.util.Arrays;
class SolutionSL{
    public static void SecSmallLarge(int[] arr, int n){
        // Edge Case
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

*/


// 2. Optimal Solution for Smallest Element in the Array

import java.util.Scanner;
class SolutionSL{
    public static int secondSmallest(int[] arr, int n){
        // Edge Case
        if(n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            }
            else if (arr[i] < second_small && arr[i] != small) {
                second_small = small;
            }
        }
        return second_small;
    }

    public static int secondLargest(int[] arr, int n){
        // Edge Case
        if(n < 2) {
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            }
            else if (arr[i] > second_large && arr[i] != large) {
                second_large = large;
            }
        }
        return second_large;
    }
}


public class SecSmallLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        if (sc.hasNextInt()) {
            int n =  sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter" + n +"elements:");
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

        int secondSmall = SolutionSL.secondSmallest(arr, n);
        int secondLarge = SolutionSL.secondLargest(arr, n);
    
        System.out.println("Second Smallest Element: " + secondSmall);
        System.out.println("Second Largest Element: " + secondLarge);

        }
        sc.close();
    }
}
