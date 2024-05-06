import java.util.Scanner;

public class triplet_sum {

    public static boolean search(int[] arr, int k, int si) {
        int i = si;
        int j = arr.length-1;
        while (i<j){
            if(arr[i] + arr[j] == k){
                return true;
            }
            else if(arr[i]+arr[j] > k){
                j--;
            }
            else i++;
        }
        return false;
    }

    public static boolean triplet (int[] arr, int k){
        for(int i=0; i<arr.length-2; i++){
            if(search(arr, k-arr[i], i+1)){
                return true;
            }
        }
        return false;
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
        System.out.print("Enter the sum to be searched: ");
        int k = sc.nextInt();
        System.out.println(triplet(arr, k));
    }

}
