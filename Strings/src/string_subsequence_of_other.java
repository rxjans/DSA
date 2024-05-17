import java.util.Scanner;

public class string_subsequence_of_other {

    public static boolean substring(String str, String sub){
        if(str.length()<sub.length()){
            return false;
        }
        int i = 0;
        int j = 0;
        while(i<str.length()){
            if(str.charAt(i) == sub.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
            if(j>sub.length()-1){
                return true;
            }
        }
        return false;
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
