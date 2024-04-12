import java.util.Scanner;

public class Longest_even_odd_subarray {

    public static int sum(int[] arr) {
        int result = 1;
        for(int i=0; i<arr.length; i++){
            int current = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]%2==0 && arr[j-1]%2!=0 || arr[j]%2!=0 && arr[j-1]%2==0){
                    current++;
                }
                else {
                    break;
                }
            }
            result = Math.max(result, current);
        }
        return result;
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
        System.out.println(sum(arr));
    }

}
