import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to your Calculator app!");
        System.out.println("Please enter your first number");
            num1 = input.nextInt();
        System.out.println("Thank you! Please enter your second number");
            num2 = input.nextInt();
        System.out.println("Please enter the operation type eg: (+,-,/,*) ");
            operation = input.next();

        switch (operation) {
            case "+":
                System.out.println("Your calculation is: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Your calculation is: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Your calculation is: " + (num1 * num2));
                break;
            case "/":
                System.out.println("Your calculation is: " + (num1 / num2));
                break;
            default:
                System.out.println("invalid format please try again!");
                break;
        }
    }
}
