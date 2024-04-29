import java.util.Scanner;

public class infinite_array {


    public static int binary_search(int[] arr, int low, int high, int k){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == k){
            return mid;
        }
        else if(arr[mid]>k){
            return binary_search(arr, low, mid-1, k);
        }
        else return binary_search(arr, mid+1, high, k);
    }

    public static int search(int[] arr, int k){
        if(arr[0] == k){
            return 0;
        }
        int i = 1;
        while(i<k){
            i = 2*i;
        }
        return binary_search(arr, i/2+1, i-1, k);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Assuming this is an infinite array. Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int k = sc.nextInt();
        System.out.println(search(arr, k));
    }

}
