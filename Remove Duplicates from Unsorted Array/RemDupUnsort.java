// Remove Duplicates From an Unsorted Array
// Optimal(Map)

import java.util.*;
public class RemDupUnsort {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        HashMap<Integer, Boolean> seen = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        // Iteration
        for(int val : arr){
            // if not already seen, add to result
            if (!seen.containsKey(val)) {
                result.add(val);
                seen.put(val, true);
            }
        }
        // Output
        System.out.println("Given Array: " + Arrays.toString(arr));

        System.out.print("Array after removing duplicates: ");
        for (int nums : result) {
            System.out.print( nums + " ");
        }
    }
}

// TC: O(N)
// SC: O(N)