import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Logic
        // Use double bacause average can be a decimal
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (double) arr[i];

        }
        double average = sum/n;
        System.out.println("Average: " + average);
    }
}

// TC: O(n)
// SC: O(1)