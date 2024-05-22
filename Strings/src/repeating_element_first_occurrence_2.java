import java.util.Arrays;
import java.util.Scanner;

public class repeating_element_first_occurrence_2 {
    static final int CHAR = 256;
    public static int count(String str){
        int[] count = new int[CHAR];
        Arrays.fill(count, -1);
        int res = Integer.MAX_VALUE;
        for(int i=0; i<str.length(); i++){
            int fIndex = count[str.charAt(i)];
            if(fIndex == -1){
                count[str.charAt(i)] = i;
            }
            else res = Math.min(res, fIndex);
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("first occurrence: " + count(str));
    }

}
