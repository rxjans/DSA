import java.sql.SQLOutput;
import java.util.Scanner;

public class left_rotate_array_by_n_2 {

    public static void leftRotate(int[] arr, int k) {
        int[] temp = new int[k];
        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }
        for(int i= k; i<arr.length; i++){
            arr[i-k] = arr[i];
        }
        for(int i=0; i<k; i++){
            arr[arr.length-k+i] = temp[i];
        }
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
        System.out.print("Specify the number of rotations: ");
        int k = sc.nextInt();
        leftRotate(arr, k);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
