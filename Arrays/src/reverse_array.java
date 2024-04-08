import java.util.Scanner;

public class reverse_array {

    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length -1;
        int temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
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
        reverse(arr);
    }
}
