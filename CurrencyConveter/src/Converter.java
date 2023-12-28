import java.util.Scanner;



public class Converter {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the currency you'd like to convert to: USD, CZK, EUR");
        String Currency = Scanner.nextLine();
        System.out.print("Next enter the amount of GBP you'd like to convert: ");
        float CurrencyAmount = Scanner.nextFloat();

        float USD = CurrencyAmount * 1.21F;
        float EUR = CurrencyAmount * 1.14F;
        float CZK = CurrencyAmount * 26.84F;

        if (Currency.equalsIgnoreCase("USD")) {
            System.out.println("$ " + USD);
        } else if (Currency.equalsIgnoreCase("EUR")) {
            System.out.println("€ " + EUR);
        } else if (Currency.equalsIgnoreCase("CZK")) {
            System.out.println(CZK + " Kč");
        } else {
            System.out.println("Wrong Format, Please Try Again!");
        }


    }


}
