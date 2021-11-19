import java.util.*;

public class DemoUnlabeledBreak
{
    /** Programa para demonstrar o uso de unlabeled DemoUnlabeledBreak
    * @author Alejandro Costa 2021-11-19
    * @see Horstmann (2019) Core Java Volume I
    * @version 0.1
    **/
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Entre com o valor com o qual deseja contribuir a cada ano:\n> ");
        double payment = in.nextDouble();

        System.out.print("Entre com o valor que deseja receber como aposentadoria:\n> ");
        double goal = in.nextDouble();

        System.out.print("Entre com a taxa de juros (em %) praticada:\n> ");
        double interestRate = in.nextDouble() / 100;

        double balance = 0;
        int years = 0;

        while (years <= 70)
        {
            balance += payment;
            double interest = balance * interestRate;
            balance += interest;
            if (balance >= goal) break;
            years++;
        }

        System.out.println("Saldo de aposentadoria: " + balance);
        System.out.println("Tempo de contribuição: " + years);

    }
}
