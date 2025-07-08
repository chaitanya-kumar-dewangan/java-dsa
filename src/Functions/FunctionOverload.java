package Functions;
// function overloading may happen when same name of function already exists at the same type no mater its return type is same or not, and the parameters are different
public class FunctionOverload {
    public static void main(String[] args) {
        fun(5);
        fun("chaitanya");
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
