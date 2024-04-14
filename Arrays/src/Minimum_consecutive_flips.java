import java.util.Scanner;

public class Minimum_consecutive_flips {

    public static void flip(int[] arr) {
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                if(arr[i] != arr[0]){
                    System.out.print("From " + i + " to ");
                }
                else {
                    System.out.println(i-1);
                }
            }
        }
        if(arr[arr.length-1] != arr[0]){
            System.out.print(arr.length-1);
        }
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
        flip(arr);
    }

}
