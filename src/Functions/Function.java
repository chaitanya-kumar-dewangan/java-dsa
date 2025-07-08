package Functions;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {

        // define variables
        // int a; int b; int sum;
        //Q. Take input of two numbers and find sum of them
        String newgreet = myGreet("Chaitanya");
        System.out.println(newgreet);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter First Number");
//        int num1 = input.nextInt();
//        System.out.println("Enter Second Number");
//        int num2 = input.nextInt();
//
//        System.out.println(num1 + num2);
//
//
//        int ans = sum2();
//        System.out.println("final" + ans);
//        sum();
//
//        int ans1 = sum3(4, 5);
//        System.out.println(ans1);
    }
    /*
    access modifiers (learn in oops) return_type name(){
    //body
    return statement;
    }
     */
// int return

    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number");
        int num2 = input.nextInt();
        System.out.println(num1 + num2);
        int add = num1 + num2;
        return add; // function breaks here
    }

    //void return
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number");
        int num2 = input.nextInt();
        System.out.println(num1 + num2);
    }

    //    pass the value while calling the method
    static int sum3(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
