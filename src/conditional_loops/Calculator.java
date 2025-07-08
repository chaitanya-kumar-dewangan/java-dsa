package conditional_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.println("Initial: " +result);
        while (true) {
            System.out.println("Enter Number");
            int num1 = input.nextInt();
            System.out.println("Enter Operations");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                if (op == '+') {
                    result = result + num1;
                }
                if (op == '-') {
                    result = result - num1;
                }
                if (op == '*') {
                    result = result * num1;
                }
                if (op == '/') {
                    if (num1 != 0) {
                        result = result / num1;
                    }
                }
                if (op == '%') {
                    result = result % num1;
                }
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println("Total:" +result);
        }
    }
}
