import java.util.*;
public class tcs_5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            int num = sc.nextInt();
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }
            if (sum % 3 == 0) {
                System.out.print("TRUE");
            } else System.out.print("FALSE");
        }
}
