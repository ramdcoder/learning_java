import java.time.*;
import java.util.*;

class Employee
{
    /**
    * Criação de classe para praticar.
    * @version 0.1 2021-11-24
    **/

    // keyword private = apenas os métodos dessa classe possuem acesso a essa variável [encapsulation]
    private final String name; // keyword final = o campo da instância precisa ser inicializado quando o objeto for construído. Não haverá método para modificá-lo posteriormente. Ex.: não vai existir o método setName nessa classe.
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

    // todos esses métodos get... são métodos acessores. Eles não modificam nada, apenas acessam os campos de instância. Importante: nunca retorne um tipo de objeto que seja mutável através de um método acessor. Se fizer isso, a encapsulation foi quebrada e qualquer alteração que o usuário faça no resultado da chamada do método acessor, poderá modificar o estado da instância. Se for necessário retornar um objeto mutável, crie antes um clone. Ex.: ... return (Date) hireDay.clone(); Assim é criado um clone e o clone é retornado. Se o clone for alterado, o estado da instância não será.
    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    /* parâmetros implícitos e explícitos.
    * Implícitos - o objeto do tipo Employee que aparece antes da chamada desse método. É o target ou receiver do método. Ex.: hammer.raiseSalary(5);
    * Explícitos - parâmetros listados explícitamente na declaração do método. Ex.: o double byPercent.
    * Em qualquer método, a keyword this se refere ao parâmetro implícito. Poderíamos escrever: this.salary. Vantagem: distinção clara entre campos de instância e variáveis locais.
    */
    public void raiseSalary(double byPercent)
    {
        double raise = this.salary * byPercent/100;
        this.salary += raise;
    }
}
