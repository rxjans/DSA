import java.util.Scanner;

public class square_root {

    public static int sqrt(int low, int high, int n, int ans) {
        if(low>high){
            return ans-1;
        }
        int mid = (low+high)/2;
        int square = mid*mid;
        if(square > n){
            return sqrt(low, mid-1, n, ans);
        }
        else if(square < n){
            return sqrt(mid+1, high, n, mid+1);
        }
        else {
            return mid;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Find Square root of the number: ");
        int n = sc.nextInt();
        System.out.println(sqrt(0, n, n, 0));
    }

}
