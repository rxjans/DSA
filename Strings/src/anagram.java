import java.util.Scanner;

public class anagram {
    static final int CHAR = 256;
    public static boolean substring(String str, String sub){
        if(str.length()>sub.length() || str.length()<sub.length()){
            return false;
        }
        int[] count = new int[CHAR];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
            count[sub.charAt(i)]--;
        }
        for(int i=0; i<count.length; i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
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
