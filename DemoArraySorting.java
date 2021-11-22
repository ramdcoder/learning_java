import java.util.*;
import java.lang.Math;

public class DemoArraySorting
{
    /**
    * Programa para demonstrar algumas operações com arrays, incluindo a ordenação - sorting.
    * @author Alejandro Costa 2021-11-22
    * @version 0.1
    * @see Horstmann (2019) Core Java Volume I
    **/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw?\n> ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw?\n> ");
        int n = in.nextInt();

        //preenche um array com os números de 1 a n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        //retira k números e os coloca em um segundo array de resultado do sorteio
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            //faz um índice aleatório entre 0 e n - 1
            int r = (int) (Math.random() * n);

            //toma o elemento da localização aleatória
            result[i] = numbers[r];

            //move o último elemento para a localização aleatória
            numbers[r] = numbers[n - 1];
            n--;
        }

        //imprime o array sorteado
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result)
            System.out.println(r);

    }
}
