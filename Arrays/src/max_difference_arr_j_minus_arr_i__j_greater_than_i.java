import java.util.Scanner;

public class max_difference_arr_j_minus_arr_i__j_greater_than_i {

    public static int maxDiff(int[] arr) {
        int max = arr[1] - arr[0];
        int min = arr[0];
        for(int j=1; j<arr.length; j++){
            max = Math.max(max, arr[j] - min);
            min = Math.min(min, arr[j]);
        }
        return max;
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
        System.out.println(maxDiff(arr));
    }

}
