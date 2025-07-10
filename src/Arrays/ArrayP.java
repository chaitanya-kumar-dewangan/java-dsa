package Arrays;

import java.util.Scanner;

public class ArrayP {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        arr[0] = 8;
//        arr[1] = 10;
//        arr[2] = 99;
//        arr[3] = 25;
//        arr[4] = 14;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);

        Scanner input = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Entere the element for index number:" +i);
            arr[i]= input.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }


    }
}
