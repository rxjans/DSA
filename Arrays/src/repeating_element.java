import java.util.*;
public class repeating_element {

    public static int repeat(int[] arr){
        boolean[] isVisited = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            if(isVisited[arr[i]]){
                return arr[i];
            }
            isVisited[arr[i]] = true;
        }
        return -1;
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
        System.out.print(repeat(arr));
    }

}
