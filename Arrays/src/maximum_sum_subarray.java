import java.util.Scanner;

public class maximum_sum_subarray {

    public static int sum(int[] arr) {
        int max = arr[0];
        for(int i= 0; i<arr.length; i++){
            int curr = 0;
            for(int j =0; j<arr.length; j++){
                curr = curr + arr[j];
                max= Math.max(max, curr);
            }
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
        System.out.println(sum(arr));
    }

}
