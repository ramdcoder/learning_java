import java.util.*;

public class DemoWhileLoop
{
    /**
    * Programa para demonstrar o uso de um loop while em Java
    * Alejandro Costa
    * Referência: Horstmann (2019) Core Java Volume I
    **/

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire?\n> ");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year?\n> ");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %:\n> ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal)
        {
            balance += payment;
            double interestTotal = balance * interestRate / 100;
            balance += interestTotal;
            years++;
        }

        System.out.println("Years to retire: " + years);

    }
}
