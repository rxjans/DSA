import java.util.Scanner;

public class reverse_string {

    public static StringBuilder palindrome(String str){
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return rev;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Output: " + palindrome(str));
    }

}
