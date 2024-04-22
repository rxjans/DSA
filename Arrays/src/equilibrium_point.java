import java.util.Scanner;

public class equilibrium_point {

    public static boolean eq(int[] arr) {
        int right = 0;
        for(int i=0; i<arr.length; i++){
            right += arr[i];
        }
        int left = 0;
        for(int i=0; i<arr.length; i++){
            right -= arr[i];
            if(left == right){
                return true;
            }
            left += arr[i];
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
        if(eq(arr)){
            System.out.println("Array has an equilibrium point");
        }
        else System.out.println("Array does not have an equilibrium point");
    }

}
