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
        System.out.println("\nBefore the call of tripleValue: percent = " + percent);
        tripleValue(percent);
        System.out.println("After the call of tripleValue: percent = " + percent);
        System.out.println("Response to question: No.\n");
        System.out.println("--".repeat(15));

        //métodos podem alterar o estado de uma instância
        System.out.println();
        System.out.println("Does a method can change the state of an object parameter?");
        System.out.println("\nTesting with .tripleSalary():");
        System.out.println("Creating an instance of class Employee...");
        var harry = new Employee("Harry", 50000);
        System.out.println("Salary before calling tripleSalary: " + harry.getSalary());
        System.out.println("Calling method...");
        tripleSalary(harry);
        System.out.println("Salary after calling tripleSalary: " + harry.getSalary());
        System.out.println("Response to question: Yes.\n");
        System.out.println("--".repeat(15));


    } //main

    public static void tripleValue(double value)
    {
        value *= 3;
        System.out.println("End of tripleValue method: value = " + value);
    }

    public static void tripleSalary(Employee anEmployee)
    {
        anEmployee.raiseSalary(200);
        System.out.println("End of method. Salary: " + anEmployee.getSalary());
    }

} //Parameters

class Employee
{
    private String name;
    private double salary;

    public Employee(String n, double s)
    {
        this.name = n;
        this.salary = s;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}
