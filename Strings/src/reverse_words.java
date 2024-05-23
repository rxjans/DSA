import java.util.*;
public class reverse_words {

    public static void reverse(char[] str, int start, int end){
        char temp;
        while(start<end){
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String k = sc.nextLine();
        int start = 0;
        char[] str = k.toCharArray();
        for(int i=0; i<str.length; i++){
            if(str[i] == ' '){
                reverse(str, start, i-1);
                start = i+1;
            }
        }
        reverse(str, start, k.length()-1);
        reverse(str, 0, k.length()-1);
        String s = new String(str);
        System.out.print(s);
    }

}
