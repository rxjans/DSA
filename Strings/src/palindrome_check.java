import java.util.*;
public class palindrome_check {

    public static boolean palindrome(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.contentEquals(rev);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print(palindrome(str));
    }

}
