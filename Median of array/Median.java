import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        // 1. Sorting 

        // Arrays.sort(arr); // Built-in sorting
        // Manual Sorting

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // System.out.println("Sorted Array: " + Arrays.toString(arr)); 
        // or 
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }

        // Logic
        if (n % 2 == 0) {
            int i1 = (n/2) - 1;
            int i2 = (n/2);
            System.out.print((double) (arr[i1] + arr[i2]) /2);
        }
        else{
            System.out.print(arr[n/2]);
        }
    }    
}

/*
TC: O(nlogn)
SC: O(1)
*/
