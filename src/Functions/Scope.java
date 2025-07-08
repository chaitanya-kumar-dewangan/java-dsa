package Functions;

public class Scope {
    public static void main(String[] args) {
    int a =10;
    int b =20;
//    c = 90; // cant access from here
        {
//            int a =90;  // already initialized outside the block in the same method, hence you cannot initialize same again
            a = 100;  // reassigning the value to the already existing variable

            int c = 8; // cant use this outside this block
            int d = 8;
            System.out.println(a); //100
        }



        System.out.println(a); // 100
//        System.out.println(d); // cannot use outside the block

    }
    static void random(){

    }
}
