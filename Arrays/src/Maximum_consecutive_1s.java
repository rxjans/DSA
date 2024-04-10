import java.util.Scanner;

public class Maximum_consecutive_1s {

    public static int water(int[] arr) {
        int result = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 1){
                count = 0;
            }
            else if(arr[i] == 1){
                count ++;
            }
            result = Math.max(result, count);
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
        System.out.println(water(arr));
    }

}
