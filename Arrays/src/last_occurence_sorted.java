import java.util.Scanner;

public class last_occurence_sorted {

    public static int lastOcc(int[] arr, int low, int high, int k) {
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]>k){
            return lastOcc(arr, low, mid-1, k);
        }
        else if(arr[mid]<k){
            return lastOcc(arr, mid+1, high, k);
        }
        else {
            if(mid == arr.length-1 || arr[mid] != arr[mid+1]){
                return mid;
            }
            else return lastOcc(arr, mid+1, high, k);
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
        System.out.print("Enter the element to be searched: ");
        int k = sc.nextInt();
        System.out.println(lastOcc(arr,0, arr.length-1, k));
    }

}
