// 6. Calculate Sum of the Elements of the Array

import java.util.Scanner;
public class SumofElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        //Output
        System.out.println(sum);
    }
}

// TC: O(n) 
// SC: O(1)
