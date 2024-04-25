import java.util.Scanner;

public class binary_search_recursive {

    public static int search(int[] arr, int low, int high, int k) {
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == k){
            return mid;
        }
        else if(arr[mid]>k){
            return search(arr, low, mid-1, k);
        }
        else return search(arr, mid+1, high, k);
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
        System.out.println(search(arr,0, arr.length-1, k));
    }

}
