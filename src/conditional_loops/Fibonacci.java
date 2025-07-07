package conditional_loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to generate fibonacci series");
        int num = input.nextInt();

        int num1 = 0;
        int num2 = 1;
        int count = 2;
        while (count <= num) {
            int temp = num2;
            num2 = num1 + num2;
            num1 = temp;
            count++;
            System.out.print(num1 + " ");
        }

    }
}
