import java.util.*;

class DemoInputProgram
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //existem vários métodos associados com Scanner

        System.out.print("What is your name? ");
        String name = in.nextLine(); // o input pode conter espaços

        System.out.print("Do you prefer a motorcycle or a car? ");
        String preference = in.next(); // apenas primeira palavra será considerada (delimitada por um espaço)

        System.out.print("Please inform your age: ");
        int age = in.nextInt();

        System.out.println("Your name is " + name + " and you are " + age + " years old.");
        System.out.println("Your preference was " + preference);
    }
}
