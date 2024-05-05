import java.util.Scanner;

public class two_pointer {

    public static boolean search(int[] arr, int k) {
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            if(arr[i] + arr[j] == k){
                return true;
            }
            else if(arr[i]+arr[j] > k){
                j--;
            }
            else i++;
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
        System.out.print("Enter the sum to be searched: ");
        int k = sc.nextInt();
        System.out.println(search(arr, k));
    }

}
