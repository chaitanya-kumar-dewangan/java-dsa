package conditional_loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        char ch = c.next().trim().charAt(0); //character at o th index

        if(ch>= 'a' && ch<='z'){
            System.out.println("the character is in lower case");
        } else if (ch>='A' && ch<='Z') {
            System.out.println("the character is in upper case");

        }
        else {
            System.out.println("the input is not a valid character");
        }
    }
}
