import java.util.*;

class tcs_8{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        if(sum > 8 && sum < 50){
            System.out.println("Sum of odd numbers:"+ sum);
        }
        else System.out.print("NA");
    }
}