class DemoWithOperators
{
    /** Exemplos de uso de operadores relacionais e booleanos **/

    public static void main(String[] args)
    {
        int variable1 = 5;
        int variable2 = 7;
        int variable3 = 9;

        System.out.println(variable1 == variable2);
        System.out.println(variable1 < variable2);
        System.out.println(variable1 > variable2);
        System.out.println(variable1 < variable2 && variable2 < variable3); //and
        System.out.println(variable1 < variable2 || variable2 < variable3); //or

        System.out.println(variable1 < variable3 ? "Variable 1 is smaller!" : "Variable 1 is not smaller!"); //operador ternary ?:  CONDIÇÃO ? EXPRESSÃO 1 : EXPRESSÃO 2. Expressão 1 se con condição for true, expressão 2 se a condição for false.
    }
}
