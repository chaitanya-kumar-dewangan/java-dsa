package conditional_loops;

import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENter the number you wants to reverse");
        int original = input.nextInt();
//        while(original>0){
//            int rem = original%10;
//            original = original/10;
//            System.out.print(rem);
//        }

        int reverse = 0;
        while(original>0){
            int remender = original%10;
            original = original/10;
            reverse = reverse*10 + remender;
        }
        System.out.println("Reverse Number is :" +reverse);
    }
}
