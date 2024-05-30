import java.util.Scanner;

public class median_two_sorted_arrays {

    public static double median(int[] a1, int[] a2){
        int begin = 0;
        int end = a1.length;
        int n1 = a1.length;
        int n2 = a2.length;
        while(begin <= end){
            int i1 = (begin +  end)/2;
            int i2 = (n1 + n2 + 1)/2 - i1;
            int min1 = (i1==n1) ? Integer.MAX_VALUE : a1[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a1[i1-1];
            int min2 = (i2 == n2) ? Integer.MAX_VALUE : a2[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : a2[i2-1];
            if(max1 <= min2 && max2 <= min1 ){
                if((n1+n2)%2!=0){
                    return (double) Math.max(max1, max2);
                }
                else return ((double) Math.min(min1, min2)+Math.max(max1, max2))/2;
            }
            else if(max1 > min2){
                end=i1-1;
            }
            else begin = i1+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Specify First Array Length: ");
        int n = sc.nextInt();
        System.out.print("Specify Second Array Length: ");
        int k = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[k];
        System.out.print("Enter elements in first array: ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.print("Enter elements in second array: ");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        System.out.println("Median: " + median(a1, a2));

    }



}
