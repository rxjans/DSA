import java.util.Scanner;

public class longest_even_odd_subarray_2 {

    public static int sum(int[] arr) {
        int result = 1;
        int current = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0){
                current++;
                result = Math.max(result, current);
            }
            else {
                current =1;
            }
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
