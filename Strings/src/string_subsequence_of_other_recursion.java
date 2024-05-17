import java.util.Scanner;

public class string_subsequence_of_other_recursion {

    public static boolean substring(String str, String sub, int m, int n){
        if(n==0){
            return true;
        }
        if(m==0){
            return false;
        }
        if(str.charAt(m-1) == sub.charAt(n-1)){
            return substring(str, sub, m-1, n-1);
        }
        else return substring(str, sub, m-1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the substring to be checked: ");
        String sub = sc.nextLine();
        System.out.print(substring(str, sub, str.length(), sub.length()));
    }

}
