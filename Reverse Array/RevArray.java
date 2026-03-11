// 3. Reverse an array

// * Brute force method

/* 
import java.util.Scanner;
public class RevArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - 1 - i];
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}

// TC: O(n)
// SC: O(n)
*/

// Optimal method(Two pointers)

import java.util.Scanner;

public class RevArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        int p1 = 0;
        // int p2 = arr.length - 1;
        int p2 = n - 1;
        while(p1 < p2){
            // Swapping p1 & p2
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            // Incrementing p1
            p1++;

            // Decrementing p2
            p2--;
        }

        // Output
        for(int num : arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
