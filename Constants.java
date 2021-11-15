public class Constants
{
    public static void main(String[] args)
    {
        final double CM_PER_INCH = 2.54; //a keyword final serve para se declarar uma constante. Esse valor não pode mais ser alterado no código. É comum se nomear constantes com todas as letras maiúsculas. O mais comum é se criar class constants. É uma constante que fica disponível para vários métodos da classe. Ver a classe Constants2.
        double papperWidth = 8.5;
        double papperHeight = 11;
        System.out.println("Paper size in centimeters: " + papperWidth * CM_PER_INCH + " by " + papperHeight * CM_PER_INCH);
    }
}
