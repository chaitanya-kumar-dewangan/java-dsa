package conditional_loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = in.nextInt();
        System.out.println("Enter second number");

        int b = in.nextInt();
        System.out.println("Enter third number");

        int c = in.nextInt();

        // Q. find the largest number between three

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Largest Number is : " + max);

    }
}
