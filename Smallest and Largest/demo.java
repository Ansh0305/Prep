
// 1. Smallest Element in the Array
import java.util.Scanner;
class Solution{
    // Brute Force
    /* 
    public static int sortArr(int[] arr){
        // Built in Feature
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // Manual Sorting
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        return arr[0];

     }
        */

     // Optimal Solution
     public static int SmallestElement(int[] arr){
        int n = arr.length;
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
     }
    //  TC = O(n)

    }

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt(); 
            }
            
        }
        System.out.println("Smallest element is: " + Solution.SmallestElement(arr));
        sc.close();
    }
}