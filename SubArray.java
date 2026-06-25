import java.util.Scanner;

public class SubArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subarrays:");

        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {
                System.out.print("[");
                for(int k = start; k <= end; k++) {
                    System.out.print(arr[k]);
                    if(k < end)
                        System.out.print(", ");
                }
                System.out.println("]");
            }
        }

        sc.close();
    }
}