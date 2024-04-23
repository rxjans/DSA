import java.util.Scanner;

public class maximum_appearing_element {

    public static int maxAppear(int[] starting, int[] ending){
        int[] freq = new int[100];
        for(int i=0; i<starting.length; i++){
            for(int j=starting[i]; j<=ending[i]; j++){
                freq[j] += 1;
            }
        }
        int max = 0;
        for(int i=1; i<100; i++){
            if(freq[max] < freq[i]){
                max = i;
            }
        }
        return max;
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
