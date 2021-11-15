class DemoWithStrings
{
    public static void main(String[] args)
    {
        String myString1 = "Hello World! \nBy Java\u2122"; //Strings são uma sequência de UNICODE
        String s = myString1.substring(0, 3); //uma substring com caractere inicial e final não inclusivo

        String word1 = "Wel";
        String word2 = "come";
        String message = word1 + word2; //concatenação de strings

        int age = 21;
        String rating = "PG" + age; //concatenação de string com outro tipo. O outro tipo é convertido para String.

        System.out.println(myString1);
        System.out.println(s);
        System.out.println(message);
        System.out.println(rating);

        System.out.println("Putting lots of strings together and separating by a delimiter: ");
        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);

        System.out.println("Using the repeat method: ");
        String repeated = "Java is awesome! ".repeat(5);
        System.out.println(repeated);

        System.out.println("If Strings are immutable, how could I change my string? From Hello! to Help!: ");
        System.out.println("myString1: " + myString1);
        myString1 = myString1.substring(0, 3) + "p!";
        System.out.println("myString1: " + myString1);

        System.out.println("Testing if two strings are equal: ");
        System.out.println(myString1.equals(word1)); //sempre testar se duas strings são idênticas utilizando esse método. Nunca utilizar ==, pois esse operador com strings pode gerar bugs difíceis de solucionar. Ele testa se as strings estão na mesma localização e não se são iguais.
        String toCompare1 = "Family";
        String toCompare2 = "family";
        System.out.println(toCompare1.equalsIgnoreCase(toCompare2)); //comparação sem considerar letras maiúsculas ou minúsculas
        System.out.println("family".equals(toCompare2)); //podemos utilizar uma string literal



    }
}
