package Functions;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number to check that is prime or not");
        int n = in.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);

        for (int i = 0; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + "  ");
            }
        }
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == original;
    }
}
