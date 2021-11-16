import java.util.*;

public class DemoOutputFormatting
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Inform your age: \n> ");
        int age = reader.nextInt();
        System.out.print("Inform your first name: \n> ");
        String name = reader.next();

        System.out.printf("Hello, %s. Next year you will be %d!", name, age+1); //s porque é uma string. d porque é decimal integer. Se fosse um float, seria f. Se fosse um boolean seria b.
        System.out.println("");

        double result = 10_000 / 3;
        System.out.println(result);
        System.out.printf("%8.2f", result); //imprime 8 campos, sendo o primeiro um espaço e o número com duas casas decimais.

        System.out.println("");
        String formattedString = String.format("Good bye, %s. See you in 2022, when you are %d years old!", name, age+1);
        System.out.println(formattedString);

    }
}
