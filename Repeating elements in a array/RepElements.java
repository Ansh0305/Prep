// Find all repeating elements in an array

/* Brute Force
import java.util.*;
public class RepElements{
    public static void main(String[] args){
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        // Logic
        int dup[] = new int[n];
        int cnt = 0;
        // Nested for loop
        for(int i = 0; i<n; i++){
            for(int j= i+1; j<n; j++){
                if (arr[i] == arr[j]) {
                    dup[cnt++] = arr[i];
                }
            }
        }
        // Output
        System.out.print("The repeating elemets are: ");
        for(int i = 0; i < cnt; i++){
            // Ensure dup are not printed twice
            if (i == 0 || dup[i] != dup[i - 1]) {
                System.out.print(dup[i] + " ");
            }
        }
    }
}
// TC: O(n^2) + O(n)
// SC: O(n)

*/

// Optimal- HashMap

import java.util.*;
public class RepElements{
    public static void main(String[] args) {
        // Input
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        Map<Integer, Integer> elementCount = new HashMap<>();

        // Count the occurence of each element
        for(int i : arr){
            elementCount.put(i, elementCount.getOrDefault(i, 0) + 1);
        }

        // Output
        System.out.print("The repeated values are: ");
        // Print the elements that appear more than once
        for(Map.Entry<Integer, Integer> entry : elementCount.entrySet()){
            if(entry.getValue() > 1){
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}

// TC: O(N)
// SC: O(N)