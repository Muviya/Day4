import java.util.Scanner;

public class Subsequence{

    static void printSubsequence(int[] arr, int index, String current) {
        if(index == arr.length) {
            System.out.println("[" + current.trim() + "]");
            return;
        }

        // Include current element
        printSubsequence(arr, index + 1, current + arr[index] + " ");

        // Exclude current element
        printSubsequence(arr, index + 1, current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subsequences:");
        printSubsequence(arr, 0, "");

        sc.close();
    }
}