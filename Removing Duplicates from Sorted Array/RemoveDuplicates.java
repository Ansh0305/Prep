
import java.util.Scanner;

// Remove Duplicates in-place from Sorted Array
/* 
// Brute Force approach(HashSet)

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        HashSet<Integer> seen = new HashSet<>();
        int index = 0;

        for(int num : arr){
            if (!seen.contains(num)) {
                seen.add(num);
                arr[index] = num;
                index++;
            }
        }
        // Output
        System.out.println("Given Array: " + Arrays.toString(arr)); 

        System.out.print("After removing duplicates: "); 
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// TC: O(n)
// SC: O(n)

*/

// Optimal approach(Two Pointer)

public class RemoveDuplicates{
    public static void main(String[] args){
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        if (arr.length == 0) {
            System.out.println("Empty");
        }

        // Pointer for first unique element
        int i = 0;
        // Start from second element
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                // Move unique position forward
                i++;
                // Place new unique element
                arr[i] = arr[j];
            }
        }
        // i is the las index of unique element, count = i + 1
        int count = i + 1;
        // Output
        System.out.println("Unique Count: " + count);
        System.out.print("Array after removing duplicats: ");
        
        for (int k = 0; k < count; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

// TC: O(n)
// SC: O(1)