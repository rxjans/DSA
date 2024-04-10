import java.util.Scanner;

public class trapping_rain_water {

    public static int water(int[] arr) {
        int res = 0;
        for(int i=1; i<arr.length-1; i++){
            int lMax = arr[i];
            for(int j=0; j<i; j++){
                lMax = Math.max(arr[j], lMax);
            }
            int rMax = arr[i];
            for(int j=i+1; j<arr.length; j++){
                rMax = Math.max(arr[j], rMax);
            }
            res += Math.min(lMax, rMax) - arr[i];
        }
        return res;
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
