package chaitanya;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Temperature in Celcius");
        float temp = input.nextFloat();
        float tempF = (temp *9/5)+ 32;
        System.out.println("The Temperature in Ferhenite is: " + tempF);
    }
}
