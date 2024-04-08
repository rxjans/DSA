import java.util.*;
public class zeroes_to_end {

    public static void zeroes(int[] arr){
        int count = 0;
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Specify Array Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in your array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        zeroes(arr);
    }



}
