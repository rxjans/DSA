import java.util.Arrays;
import java.util.Scanner;

public class leftmost_non_repeating_character_2 {

    static final int CHAR = 256;
    public static int count(String str){
        int[] count = new int[CHAR];
        int res = Integer.MAX_VALUE;
        Arrays.fill(count, -1);
        for(int i=0; i<str.length(); i++){
            if(count[str.charAt(i)] == -1){
                count[str.charAt(i)] = i;
            }
            else count[str.charAt(i)] = -2;
        }
        for(int i=0; i<CHAR; i++){
            if(count[i] >= 0){
                res = Math.min(res, count[i]);
            }
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
