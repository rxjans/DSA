import java.util.Scanner;

public class second_largest {

    public static void secondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i] != largest || secondLargest == -1){
                if(arr[i]>secondLargest){
                    secondLargest = arr[i];
                }
            }
        }
        System.out.print("The Second Largest Element in your array is: " + secondLargest);
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
        secondLargest(arr);
    }

}
