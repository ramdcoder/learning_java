import java.util.*;

public class DemoForLoop
{
    /**
    * Programa para demonstrar a utilização de um loop for em java. Lottery Odds.
    *@author Alejandro Costa 2021-11-18
    *@version 0.1
    *@see Horstmann (2019) Core Java Volume I
    **/

    static public void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw?\n > ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw?\n > ");
        int n = in.nextInt();

        /* Computação do coeficiente binomial n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k) */
        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
