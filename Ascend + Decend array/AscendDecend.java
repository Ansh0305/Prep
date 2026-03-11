// 5. Rearrange array in increasing-decreasing order

import java.util.Scanner;

public class AscendDecend {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // 1. Bubble Sort (Ascending)
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 2. Reverse second half
        int start = n/2;
        int end = n - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Output
        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();
    }
}

// TC: O(nlogn)
// SC: O(1) 