package Functions;

import java.util.Arrays;
// Variable length arguments
public class VarArgs {
    public static void main(String[] args) {
        fun(4,4,8,9,5); // internaly store in an array

        multiple(4,8, "chaitanya", "pinku");
    }
    static  void fun( int ...v){ // use it when we dont know have many number we are going to pass
//        it interanlly taking array of integers
        System.out.println(Arrays.toString(v));

    }

    static void multiple(int a, int b, String...v){
        System.out.println("a: " +a + " b: " +b); // order maters
        System.out.println(Arrays.toString(v));

    }
}
