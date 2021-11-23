import java.time.*;

public class Calendar
{
    /**
    * Program to demonstrate the use of the interface of a class to perform tasks without having to implement or to understand details of the implementation of the methods.
    * @author Cay Horstmann. Copied by Alejandro Costa
    * @version 1.5 2015-05-08
    * @see Horstmann (2019) Core Java Volume I
    **/
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); //set to start of the month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); //1 = monday ... 7 = sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
