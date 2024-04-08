import java.util.Scanner;

public class left_rotate_array_by_n_3 {
    public static void reverse(int[] arr, int left, int right) {
        int temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
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
        reverse(arr, 0,k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
