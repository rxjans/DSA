import java.util.Scanner;

public class maximum_sum_subarray_2 {

    public static int sum(int[] arr) {
        int max=arr[0];
        int result=arr[0];
        for(int i = 1; i<arr.length; i++){
            max = Math.max(max+arr[i], arr[i]);
            result = Math.max(result, max);
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
        System.out.println(sum(arr));
    }

}
