import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert the first number : ");
        int a = input.nextInt();
        System.out.print("Please insert the second number : ");
        int b = input.nextInt();
        System.out.println("Please choose which operation you want :");
        System.out.println("1. Add\n2. Suubstract\n3. Multiply\n4. Divide\n5. Modulus");
        int operator = input.nextInt();
        switch(operator) {
            case 1:
                System.out.println("The result is " + (a + b));
                break;
            case 2:
                System.out.println("The result is " + (a - b));
                break;
            case 3:
                System.out.println("The result is " + (a * b));
                break;
            case 4:
                System.out.println("The result is " + (a / b));
                break;
            case 5:
                System.out.println("The result is " + (a % b));
                break;
            default:
                System.out.println("Please select the option provided");
        }
    }
}
