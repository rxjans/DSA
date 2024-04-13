import java.util.Scanner;

public class majority_element {

    public static int majority(int[] arr) {
        int result = 0;
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[result] == arr[i]){
                count++;
            }
            else count--;
            if(count == 0){
                result=i;
                count=1;
            }
        }
        count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[result] == arr[i]){
                count++;
            }
        }
        if(count <= arr.length/2){
            return -1;
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
        System.out.println(majority(arr));
    }

}
