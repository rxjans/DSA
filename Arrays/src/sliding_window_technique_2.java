import java.util.Scanner;

public class sliding_window_technique_2 {

    public static int maxDiff(int[] arr, int k) {
        int current = 0;
        for(int i=0; i<k; i++){
            current += arr[i];
        }
        int result = current;
        for(int i=k; i<arr.length; i++){
            current += arr[i] - arr[i-k];
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
