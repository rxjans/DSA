import java.util.Scanner;

public class count_1s_sorted {

    public static int firstOcc(int[] arr, int low, int high) {
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == 0){
            return firstOcc(arr, mid+1, high);
        }
        else {
            if(mid == 0 || arr[mid] != arr[mid-1]){
                return (arr.length - mid);
            }
            else return firstOcc(arr, low, mid-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Count occurrence of 1s. Specify Array Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in your array in a sorted manner (0 & 1s): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(firstOcc(arr,0, arr.length-1));
    }

}
