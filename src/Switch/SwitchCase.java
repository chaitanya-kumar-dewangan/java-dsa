package Switch;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit");
        String fruit = input.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King Of fruits");
            case "Apple" -> System.out.println("A sweet Red fruit");
            default -> System.out.println("Please Enter a valid fruit");
        }
    }
}
