import java.util.Scanner;

public class palindrome_check_2 {

    public static boolean palindrome(String str){
        int begin = 0;
        int end = str.length() -1;
        while(begin<end){
            if(str.charAt(begin) != str.charAt(end)){
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print(palindrome(str));
    }

}
