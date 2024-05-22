import java.util.Scanner;

public class leftmost_non_repeating {

    static final int CHAR = 256;
    public static int count(String str){
        int[] count = new int[CHAR];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++){
            if(count[str.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("first occurrence: " + count(str));
    }

}
