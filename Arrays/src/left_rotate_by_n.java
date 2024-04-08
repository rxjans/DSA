import java.util.Scanner;

public class left_rotate_by_n {
    public static void leftRotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
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
        for (int i = 0; i < k; i++) {
            leftRotate(arr);
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
