// 3. Reverse an array

// * Brute force method

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

