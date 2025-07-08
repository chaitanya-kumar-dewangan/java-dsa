package Functions;

public class Shadowing {
    static int x = 5; // this will be shodow whenever same name variable will re initialized in the sub block otf of the class it could be a function a sub block of functio any thing

    public static void main(String[] args) {
        System.out.println(x); //5

        int x = 9;
        System.out.println(x); //9
        //scope is begin when the value is initialized
    fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
