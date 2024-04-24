import java.util.Scanner;

public class maximum_appearing_element_2 {

    public static int maxAppear(int[] starting, int[] ending){
        int[] freq = new int[101];
        for(int i=0; i<starting.length; i++){
            freq[starting[i]]++;
            freq[ending[i]+1]--;
        }
        int res = 0;
        for(int i=1; i<100;  i++){
            freq[i] = freq[i-1] + freq[i];
            if(freq[res]<freq[i]){
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Specify Range Length: ");
        int n = sc.nextInt();
        int[] starting = new int[n];
        int[] ending = new int[n];
        System.out.print("Enter starting ranges: ");
        for(int i=0; i<starting.length; i++){
            starting[i] = sc.nextInt();
        }
        System.out.print("Enter ending ranges: ");
        for(int i=0; i<ending.length; i++){
            ending[i] = sc.nextInt();
        }
        System.out.println(maxAppear(starting, ending));
    }

}
