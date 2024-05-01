import java.util.Scanner;

public class peak_element {

    public static int search(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == arr.length-1 || arr[mid +1] <= arr[mid])){
                return mid;
            }
            if(mid> 0 && arr[mid-1]>= arr[mid]){
                high = mid -1;
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
        System.out.println(search(arr));
    }

}
