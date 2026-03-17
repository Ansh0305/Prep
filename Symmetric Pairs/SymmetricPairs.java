// Find all Symmetric Pairs in the array of pairs

/* Brute Force */

import java.util.Scanner;

public class SymmetricPairs {
    public static void main(String[] args){
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        // Output+Logic
        System.out.print("Symmetric pairs are: ");

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.print("(" + arr[i][0] + "," + arr[i][1] + ")");
                    break;
                }
            }
        }

    }
}

// TC: O(n^2)
// TC: O(1)