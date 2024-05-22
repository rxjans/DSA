import java.util.Arrays;
import java.util.Scanner;

public class leftmost_repeating_element {

    static final int CHAR = 256;
    public static int count(String str){
        boolean[] isVisited = new boolean[CHAR];
        int res = -1;
        for(int i=str.length()-1; i>=0; i--){
            if(isVisited[str.charAt(i)]){
                res = i;
            }
            else isVisited[str.charAt(i)] = true;
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("first occurrence: " + count(str));
    }

}
