package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter empployee id");
        int empId = input.nextInt();

        switch (empId) {
            case 1:
                System.out.println("Chaitanya Kumar Dewangan");
                break;
            case 2:
                System.out.println("jay prakash");
                break;
            case 3:
                System.out.println("Print employe id " + empId);
                System.out.println("Enter department");
                String department = input.next();

                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Maths" -> System.out.println("Maths Department");
                    default -> System.out.println("Enter a valid Department");
                }
            default:
                System.out.println("Enter valid EmpId");
        }
    }
}
