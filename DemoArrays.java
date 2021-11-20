public class DemoArrays
{
    /** Criação de arrays em java **/
    public static void main(String[] args)
    {
        int[] myFirstArray; // apenas declara o array de integer
        int[] mySecondArray = new int[100]; // declara e inicializa um array de 100 integers
        int[] myThirdArray = {2, 3, 5, 7, 11, 13}; // declara, inicializa e fornece os valores iniciais do array

        String[] authors = {
          "James Gosling",
          "Bill Joy",
          "Guy Steele",
        }; // a vírgula no final não é obrigatória, mas facilita se ainda formos adicionar mais itens posteriormente

        System.out.println("Loop for para apresentar os elementos do array: authors");
        for (int i = 0; i < authors.length; i++)
            System.out.println(authors[i]);

        System.out.println("Loop for para preencher os elementos do array: mySecondArray. Como o array é muito longo, quando i for maior que 19, uma sequência de 3 pontos será impressa e a apresentação e definição dos elementos irá parar.");
        for (int i = 0; i < mySecondArray.length; i++)
        {
            mySecondArray[i] = i;
            System.out.println(mySecondArray[i]);
            if (i > 19)
            {
                System.out.println(".\n.\n.");
                break;
            }
        }

        int[] myIntegerArray = new int[25];
        System.out.println("Loop for para apresentar os elementos de um array declarado e inicializado com new int[25]. Como o array é de integer, os valores são zero por padrão:");
        for (int i = 0; i < myIntegerArray.length; i++)
            System.out.println(myIntegerArray[i]); // um array de integer é criado com zeros por padrão

    }
}
