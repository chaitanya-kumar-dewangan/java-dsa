package chaitanya;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Name");
        String name = input.nextLine();
        System.out.print(name);

        System.out.println("Please Enter Your Roll number");
        int rollnumber = input.nextInt();
        System.out.println("Your Roll number is: " +rollnumber);

        int a = 230_000_000;
        System.out.print(a);

        float marks = input.nextFloat();
        System.out.println(marks);

    }
}
