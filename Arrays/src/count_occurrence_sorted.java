import java.util.Scanner;

public class count_occurrence_sorted {

    public static int firstOcc(int[] arr, int low, int high, int k) {
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]>k){
            return firstOcc(arr, low, mid-1, k);
        }
        else if(arr[mid]<k){
            return firstOcc(arr, mid+1, high, k);
        }
        else {
            if(mid == 0 || arr[mid] != arr[mid-1]){
                return mid;
            }
            else return firstOcc(arr, low, mid-1, k);
        }
    }

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

    public static int count(int[] arr, int k){
        int first = firstOcc(arr, 0, arr.length-1, k);
        if(first == -1){
            return 0;
        }
        else return (lastOcc(arr, 0, arr.length-1, k) - first + 1 );
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
        System.out.print("Enter the element to count it's occurrence: ");
        int k = sc.nextInt();
        System.out.println(count(arr, k));
    }

}
