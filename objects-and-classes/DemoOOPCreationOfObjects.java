import java.time.LocalDate;
import java.util.Date;

public class DemoOOPCreationOfObjects
{
    /**
    * Programa para demonstrar a criação de objetos de classes pré-existentes no Java
    * @author Alejandro Costa 2021-11-22
    * @version 0.1
    * @see Horstmann (2019) Core Java Volume I
    **/
    public static void main(String[] args)
    {
        System.out.println("Exemplos utilizando a classe Date (deprecated)");

        Date submissionDate = new Date();
        System.out.println("Data de submissão do manuscrito: " + submissionDate);

        System.out.println("Exemplos utilizando a classe LocalDate");

        LocalDate dateOfSubmission = LocalDate.now();
        System.out.println("Data de submissão do manuscrito: " + dateOfSubmission);

        LocalDate invitationToReviewDue = LocalDate.now().plusDays(14);
        System.out.println("Data limite para aceite do convite para realizar avaliação: " + invitationToReviewDue);

        LocalDate reviewDue = invitationToReviewDue.plusDays(30);
        System.out.println("Data limite para avaliação do manuscrito e envio da recomendação: " + reviewDue);

    }
}
