import java.util.*;

public class DemoDoWhileLoop
{
    /**
    * Programa para demonstrar a aplicação de uma estrutura Do While em Java
    * Alejandro Costa
    * Referência: Horstmann (2019) Core Java Volume I
    **/
    static public void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money will you contribute each year?\n > ");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %:\n > ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        do
        {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            year++;

            System.out.printf("After %d years, your balance is %,.2f%n", year, balance);
            System.out.print("Ready to retire: (Y, N)\n > ");
            input = in.next();
        }
        while (input.equals("N")); // Nunca utilizar == com String. Utilizar o método .equals()

        System.out.printf("You retire with %.2f%n", balance);
    }
}
