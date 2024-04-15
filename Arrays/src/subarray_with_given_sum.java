import java.util.Scanner;

public class subarray_with_given_sum {

    public static boolean sum(int[] arr, int sum) {
        for(int i= 0; i<arr.length; i++){
            int curr = 0;
            for(int j =i; j<arr.length; j++){
                curr = curr + arr[j];
                if(curr == sum){
                    return true;
                }
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
