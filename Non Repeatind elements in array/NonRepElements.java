// Find all the non-repeating elements in an array

/*Brute Force */

import java.util.*;
public class NonRepElements {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Output
        System.out.print("Non-repeating elements are: ");

        // Logic
        for (int i = 0; i < n; i++) {
            boolean cheak = false;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    cheak = true;
                    break;
                }
            }
            if (!cheak) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// TC: O(n^2)
// TC: O(n)