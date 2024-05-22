import java.util.Scanner;

public class repeating_element_first_occurrence {
    static final int CHAR = 256;
    public static int occurrence(String k){
        int[] count = new int[CHAR];
        for(int i=0; i<k.length(); i++){
            count[k.charAt(i)]++;
        }
        for(int i=0; i<k.length(); i++){
            if(count[k.charAt(i)] > 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String k = sc.nextLine();
        System.out.println("Index of repeating element: " + occurrence(k));
    }

}
