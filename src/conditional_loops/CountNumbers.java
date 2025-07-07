package conditional_loops;
import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n = input.nextInt();
        System.out.println("ENter NUmber for check");
        int find = input.nextInt();
        int count = 0;
        while(n>0){
            int rem =n%10;
            if(rem ==find){
                count ++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
