import java.util.Scanner;

public class stock_buy_and_sell {

    public static void profit(int[] arr) {
        int profit = 0;
        for(int i =1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        System.out.println("Total Profit: " + profit);
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
        profit(arr);
    }

}
