import java.util.Scanner;

public class left_rotate_array {
    public static void secondLargest(int[] arr){
        int temp = arr[0];
        for(int i=1; i<arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Specify Array Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in your array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        secondLargest(arr);
    }
}
