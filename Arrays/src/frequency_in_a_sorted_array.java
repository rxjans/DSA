import java.util.Scanner;

public class frequency_in_a_sorted_array {

    public static void freq(int[] arr) {
        int i=1;
        int freq=1;
        int n = arr.length;
        while(i<n){
            while(n>i && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+ ", freq: " + freq);
            i++;
            freq=1;
        }
        if(n == 1 || arr[n-1] != arr[n-2]) {
            System.out.println(arr[n - 1] + ", freq: " + freq);
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
        freq(arr);
    }

}
