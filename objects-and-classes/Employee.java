import java.time.*;

class Employee
{
    /**
    * Criação de classe para praticar.
    * @version 0.1 2021-11-24
    **/

    // keyword private = apenas os métodos dessa classe possuem acesso a essa variável [encapsulation]
    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructor tem o mesmo nome da classe e é rodado todas as vezes que iniciamos um objeto dessa classe. Ele configura o estado inicial das variáveis da instância que está sendo criada. O constructor só é chamado quando está associado a keyword new.
    public Employee(String n, double s, int year, int month, int day)
    //Cuidado: aqui não devemos declarar o tipo, se não estariamos criando variáveis locais com os mesmos nomes dos campos de instância. Ex.: String name = n; ERRADO.
    {
        // Vamos forçar para que o nome não seja null, que ele seja sempre fornecido [abordagem 'tough love']. Se o interesse fosse em permitir o desconhecimento do nome, poderíamos utilizar Objects.requireNonNullElse(n, "unknown"); ou if (n == null) name = "unknown"; else name = n; [abordagem permissiva]
        Objects.requireNonNull(n, "The name cannot be null");
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // keyword public = qualquer método de qualquer classe pode acessar esse método da classe Employee
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent/100;
        salary += raise;
    }
}
