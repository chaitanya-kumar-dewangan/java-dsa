package conditional_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q. print number from 1 to 5

//        int i=0;
//        for(int i=0; i<=4; i+=2){
//            System.out.println("new iteration:" +i);
//        }

        /*
        syntax for for loop
        for(initialization; conditioning; increament or decreament){
        body
        }
         */

        //print number from 1 to n
//        System.out.println("enter any number");
//       int in = input.nextInt();
//       for (int i =1; i<= in; i++){
//           System.out.print(i + "  ");
//       }

        //while loop

        /*
        syntax while
        while(condition){
        body
        }
         */
// int in = input.nextInt();
//        int num = 1;
//        while(num<= in){
//            System.out.print("  "+num);
//            num = num+1;
//        }


        //when to use for and while loop
    /*
    1. use while loop only when we dont know how many times the loop is going to run when it is unpredictable
     */


        //do while loop

    /*

    syntax:
    do{

    //atleast once the body executes

    }while(condition);
     */
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);



    }
}
