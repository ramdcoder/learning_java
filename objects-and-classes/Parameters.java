public class Parameters
{
    /*
    * Programa para demonstrar algumas características da linguagem Java em relação ao uso de parâmetros
    * @author Alejandro Costa
    * @version 0.1 2021-11-26
    * @see Horstmann (2019) Core Java Volume I
    */

    public static void main(String[] args)
    {
        //métodos não podem modificar parâmetros numéricos
        System.out.println();
        System.out.println("Does a method modify numeric parameters?");
        double percent = 10;
        System.out.println("Before the call of tripleValue: percent = " + percent);
        tripleValue(percent);
        System.out.println("After the call of tripleValue: percent = " + percent);
        System.out.println("Response to question: No.");
        System.out.println("--".repeat(15));

        System.out.println();
        System.out.println("Does a method can change the state of an object parameter?");
    }

    public static void tripleValue(double value)
    {
        value *= 3;
        System.out.println("End of tripleValue method: value = " + value);
    }



}
