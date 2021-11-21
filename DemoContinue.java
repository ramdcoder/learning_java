import java.util.*;

public class DemoContinue
{
    /** Programa para demonstrar o uso de continue
    * @author Alejandro Costa 2021-11-19
    * @see Horstmann (2019) Core Java Volume I
    * @version 0.1
    **/
    public static void main(String[] args)
    {
        int goal = 20;
        double sum = 0;
        Scanner in = new Scanner(System.in);

        while (sum < goal)
        {
            System.out.print("Entre com um número:\n> ");
            double number = in.nextDouble();
            if (number < 0) continue;
            sum += number; // não vai ser executado se o número informado for menor que zero
        }
    }

}
