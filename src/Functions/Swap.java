package Functions;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter vaalue of a");
        int a = input.nextInt();
        System.out.print("enter vaalue of b");
        int b = input.nextInt();

        swap(a,b);
        String greet = "chaitanya";
      greeting(greet);
        System.out.println(greet);
        String name = "chaitanya";
        String newname = changeName(name);
        System.out.println(name);
        System.out.println(newname);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("a: " + b);
    }

    static void greeting(String greet) {
        greet = "bhai";
        System.out.println(greet);

//        return greet;
    }

    static String changeName(String naam) {
        naam = "pinku";
        System.out.println(naam);
        return naam;
    }
}
