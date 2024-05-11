import java.util.*;
public class Tcs_Nqt {

    public static void result(String[] candidates, int[] scores, int k){
        for(int i=0; i<scores.length; i++){
            for(int j = i+1; j<scores.length; j++){
                if(scores[i] > scores[j]){
                    int temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                    String temp1 = candidates[i];
                    candidates[i] = candidates[j];
                    candidates[j] = temp1;
                }
            }
        }
        for(int i = scores.length-1; i>scores.length-k-1; i--){
            System.out.println(candidates[i] + ": " + scores[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of top candidates: ");
        int k = sc.nextInt();
        sc.nextLine();
        System.out.print("Number of total candidates: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] candidates = new String[n];
        int[] scores = new int[n];
        for(int i=0; i<scores.length; i++){
            System.out.print("Enter the name of the candidate: ");
            candidates[i] = sc.nextLine();
            System.out.print("Enter the score of the candidate: ");
            scores[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Number of candidates: ");
        result(candidates, scores, k);
    }

}
