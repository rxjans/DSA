import java.util.Scanner;

public class string_rotations_checking {

    public static boolean search(String str, String sub){
        if(str.length() != sub.length()) return false;
        return ((str + str).contains(sub));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the rotated pattern to check: ");
        String sub = sc.nextLine();
        System.out.println(search(str, sub));
    }

}
