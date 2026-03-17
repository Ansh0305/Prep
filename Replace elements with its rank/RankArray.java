import java.util.*;

public class RankArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Step 1: Clone and sort
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        // Step 2: Assign ranks
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for(int i = 0; i < n; i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i], rank++);
            }
        }

        // Step 3: Replace with rank
        for(int i = 0; i < n; i++){
            arr[i] = map.get(arr[i]);
        }

        // Output
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}