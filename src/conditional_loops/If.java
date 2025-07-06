package conditional_loops;

public class If {
    public static void main(String[] args) {

        int salary = 25000;

        //if else condition
//        if (salary >10000) {
//            salary = salary+ 20000;
//            System.out.println("running salary" +salary);
//        } else {
//            System.out.println("final output" +salary);
//        }

        //multiple if-else statement

        if(salary > 10000){
            salary += 2000;
            System.out.println(salary);
        } else if (salary> 2000){
            salary += 3000;
        }
        else {
            System.out.println(salary);
        }
    }
}
