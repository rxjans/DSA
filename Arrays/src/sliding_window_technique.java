import java.util.Scanner;

public class sliding_window_technique {

    public static int maxDiff(int[] arr, int k) {
        int result = Integer.MIN_VALUE;
        for(int i=0; i+k-1<arr.length; i++){
            int current = 0;
            for(int j=0; j<k; j++){
                current += arr[i+j];
            }
            result = Math.max(result, current);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Specify Array Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in your array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter window size: ");
        int k = sc.nextInt();
        System.out.println(maxDiff(arr, k));
    }

}
