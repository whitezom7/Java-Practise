import java.text.NumberFormat;
import java.util.Scanner;

public class fizz {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int answer = scanner.nextInt();

        if (answer % 5 == 0 && answer % 3 == 0){
            System.out.println("FizzBuzz");
        }
            else if (answer % 3 == 0) {
            System.out.println("Buzz");
        }
            else if (answer % 5 == 0) {
            System.out.println("Fizz");
            }





    }
}

