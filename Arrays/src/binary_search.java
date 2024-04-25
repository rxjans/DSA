import java.util.Scanner;

public class binary_search {

    public static int majority(int[] arr, int k) {
        int high = arr.length -1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid]>k){
                high = mid-1;
            }
            else low = mid+1;
        }
        return -1;
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
        System.out.println(majority(arr, k));
    }

}
