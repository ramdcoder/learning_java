public class CurrencyConverter {

    int rupee = 63;
    int dirhams = 3;
    int real = 5; //things are quite different now in Brazil
    int chilean_peso = 595;
    int mexican_peso = 18;
    int _yen = 107;
    int $australian = 2;
    int dollar; //this will be 0 because it initializes with the default value for int (0)
    int Rupee = 63;

    void printCurrencies() {

        System.out.println("Rupee: " + rupee);
        System.out.println("Dirhams: " + dirhams);
        System.out.println("Real: " + real);
        System.out.println("Chilean peso: " + chilean_peso);
        System.out.println("Mexican peso: " + mexican_peso);
        System.out.println("Yen: " + _yen);
        System.out.println("Australian dollar: " + $australian);
        System.out.println("American dollar: " + dollar);

    }

    public static void main(String args[]) {

        CurrencyConverter testingProgram = new CurrencyConverter();
        testingProgram.printCurrencies();

    }

}
