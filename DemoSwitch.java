import java.util.*;

public class DemoSwitch
{
    /**
    * Programa para demonstrar o uso do switch case.
    * Importante: Evitar o uso do switch case porque pode gerar muitos bugs se esquecer de acrescentar o break no final de cada case. É possível que mais de um bloco de instruções seja executado caso isso aconteça.
    @author Alejandro Costa 2021-11-18
    @version 0.1
    **/

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your option from 1 to 5:\n > ");
        int userOption = in.nextInt();

        switch (userOption)
        {
            case 1:
                System.out.println("User option was 1");
                break;
            case 2:
                System.out.println("User option was 2");
                break;
            case 3:
                System.out.println("User option was 3");
                break;
            case 4:
                System.out.println("User option was 4");
                break;
            case 5:
                System.out.println("User option was 5");
                break;
            default:
                System.out.println("Wrong choice.");
                break;
        }
    }
}
