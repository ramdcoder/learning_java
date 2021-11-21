import java.util.Arrays;

public class DemoArrayCopying
{
    /**
    * Programa para demonstração como realizar cópia de um array.
    *@author Alejandro Costa 2021-11-21
    *@version 0.1
    *@see Horstmann (2019) Core Java Volume I
    **/
    public static void main(String[] args)
    {
        int[] originalArray = { 5, 3, 1, 0, 0, 15, 17, 21};

        System.out.println("The original array: ");
        for (int element : originalArray)
            System.out.print(element + ", ");

        System.out.println("\nCopying the array...");
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Array copied successfully with method Arrays.copyOf(array, length)");

        System.out.println("Printing copied array: ");
        System.out.println(Arrays.toString(copiedArray));

        System.out.println("Now copying the same array, but increasing its size to double the original size...");
        int[] doubledSizedCopiedArray = Arrays.copyOf(originalArray, originalArray.length * 2);

        System.out.println("Printing doubled sized copied array: ");
        System.out.println(Arrays.toString(doubledSizedCopiedArray));
        System.out.println("End of program");

    }
}
