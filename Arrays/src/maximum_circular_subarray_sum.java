import java.util.Scanner;

public class maximum_circular_subarray_sum {

    public static int sum(int[] arr) {
        int result = arr[0];
        for(int i=0; i<arr.length; i++){
            int sum = arr[i];
            int curr = arr[i];
            for(int j=1; j<arr.length; j++){
                int index = (i + j) % arr.length;
                curr += arr[index];
                sum = Math.max(sum, curr);
            }
            result = Math.max(result, sum);
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
