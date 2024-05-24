import java.util.Scanner;

public class pattern_searching_naive_improvised {

    public static void search(String str, String sub){
        int n = str.length();
        int m = sub.length();
        for(int i=0; i<=n-m; ){
            int j =0;
            for(j=0; j<m; j++){
                if(sub.charAt(j) != str.charAt(i+j)){
                    break;
                }
            }
            if(j == m){
                System.out.println(i);
            }
            if(j==0){
                i++;
            }
            else i = (i+j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the pattern to be searched: ");
        String sub = sc.nextLine();
        search(str, sub);
    }

}
