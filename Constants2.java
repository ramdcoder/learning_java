public class Constants2
{
    public static final double CM_PER_INCH = 2.54; //como a constante foi declarada como public, até mesmo métodos de outras classes podem utilizar essa constante. Métodos de outras classes poderiam chamar: Constants2.CM_PER_INCH

    public static void main(String[] args)
    {
      double papperWidth = 8.5;
      double papperHeight = 11;
      System.out.println("Paper size in centimeters: " + papperWidth * CM_PER_INCH + " by " + papperHeight * CM_PER_INCH);
    }
}
