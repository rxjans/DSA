import java.util.Scanner;

public class search_sorted_rotated_array {

    public static int search(int[] arr, int k) {
        int high = arr.length -1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                return mid;
            }
            if(arr[low]<= arr[mid]){
                if(k>=arr[low] && k<arr[mid]){
                    high = mid-1;
                }
                else low = mid+1;
            }
            else {
                if(k>arr[mid] && k<=arr[high]){
                    low = mid+1;
                }
                else high = mid -1;
            }
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
        System.out.println(search(arr, k));
    }


}
