import java.util.Scanner;

public class p_weighted_sum {

    public static int sum(int[] arr, int start, int end) {
        int sum = 0;
        for(int i= start; i<=end; i++){
            sum += (i-start+1)*arr[i];
        }
        return sum;
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
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        System.out.println("Sum of the given window is: " + sum(arr, start, end));
    }

}
