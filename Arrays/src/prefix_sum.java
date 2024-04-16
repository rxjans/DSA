import java.util.Scanner;

public class prefix_sum {

    public static int sum(int[] arr, int[] ps, int start, int end) {
        if(start == 0){
            return ps[end];
        }
        else {
            return ps[end] - ps[start - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Specify Array Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ps= new int[n];
        ps[0] = arr[0];
        System.out.print("Enter elements in your array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1; i<arr.length; i++){
            ps[i] = ps[i-1] + arr[i];
        }
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        System.out.println("Sum of the given window is: " + sum(arr, ps, start, end));
    }

}