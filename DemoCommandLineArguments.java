public class DemoCommandLineArguments
{
    /**
    * Programa para aprender a incluir argumentos de linha de comando nos programas
    * @author Alejandro Costa 2021-11-21
    * @verseion 0.1
    * @see Horstmann (2019) Core Java Volume I
    **/
    public static void main(String[] args)
    {
        if (args.length == 0 || args[0].equals("-h")) //sempre utilizar o método .equals() para testar se uma string é igual a outra. Nunca utilizar == com strings
            System.out.print("Hello,");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye,");

        //print de outras argumentos da linha comando
        for (int i = 1; i < args.length; i++)
            System.out.print(" " + args[i]);

        System.out.println("!");
    }
}
