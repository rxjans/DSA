import java.util.Arrays;
import java.util.Scanner;

public class anagram_naive {

    public static boolean substring(String str, String sub){
        char[] s1 = str.toCharArray();
        Arrays.sort(s1);
        str = new String(s1);

        char[] s2 = sub.toCharArray();
        Arrays.sort(s2);
        sub = new String(s2);

        return (str.equals(sub));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the substring to be checked: ");
        String sub = sc.nextLine();
        System.out.print(substring(str, sub));
    }

}
