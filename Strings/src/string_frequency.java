import java.util.*;
public class string_frequency {

    public static void freq(String str){
        int[] count = new int[26];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i) - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(count[i] > 0){
                System.out.println((char) (i + 'a') + ": " + count[i]);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        freq(str);
    }

}
