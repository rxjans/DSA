import java.util.Scanner;

public class allocate_minimum_pages {

    public static int allocate(int[] arr, int k){
        int max=0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        int low = max;
        int high = sum;
        int res = 0;
        while(low <= high){
            int mid = (low+high)/2;
            if(isValid(arr, mid, k)){
                res = mid;
                high = mid-1;
            }
            else low = mid+1;
        }
        return res;
    }

    public static boolean isValid(int[] arr, int mid, int k){
        int sum = 0;
        int req = 0;
        for (int j : arr) {
            if (sum + j > mid) {
                req++;
                sum = j;
            } else sum += j;
        }
        return (req <= k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of students: ");
        int k = sc.nextInt();
        System.out.print(allocate(arr, k));
    }

}
