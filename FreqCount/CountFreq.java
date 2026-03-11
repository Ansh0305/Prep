// 4. Count the Frequency of each element in an array
// Brute Force

import java.util.Scanner;
public class CountFreq {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        boolean[] visited = new boolean[n];

        // Iterating through all the elements of the array
        for (int i = 0; i < n; i++) {
            // skip visited elements
            if(visited[i]) continue;

            // Counting the Frequency
           int count = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            // Output
            System.out.println(arr[i] + " " + count);
        }
    }
}

// TC: O(n^2)
// SC: O(n)