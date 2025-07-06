package chaitanya;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
//
//
//        //Casting incompatible types type casting
//
//        int num1 = (int)(99.5f);
//        System.out.println(num1);
//
//        //automatic type promotion in expressions
//
//        int a = 257;
//        byte b =(byte)(a); // it will store reminder of the maximum value or limit  257%256 =1
//        System.out.println(b);
//
//
//        byte c =40;
//        byte d = 20;
//        byte e = 60;
//        float result = (float) (c * d) /e;
//        System.out.println(result);

        int number = 'A';
        System.out.println(number);

        // type promotion rules
//        1. all the byte short and character values are promoted to integer
//        2. any one of the operands is float then the whole operation will converted into float
//        3. any one of the operands is long then the whole operation will converted into long
        System.out.println(9*96.3);

    }
}
