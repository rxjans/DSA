import java.util.Scanner;

public class subarray_with_given_sum_2 {

    public static boolean sum(int[] arr, int sum) {
        int current = 0;
        int start = 0;
        for(int i=0; i<arr.length; i++){
            current += arr[i];
            while(current > sum){
                current -= arr[start];
                start++;
            }
            if(current == sum){
                return true;
            }
        }
        return false;
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
        System.out.print("Enter subarray sum: ");
        int sum = sc.nextInt();
        System.out.println(sum(arr, sum));
    }

}
