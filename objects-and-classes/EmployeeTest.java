public class EmployeeTest
{
    /** Testes para classe Employee
    * @version 0.1 2021-11-24
    **/

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

        //raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        //print information about the employess
        for (Employee e : staff)
        {
            System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary() + ", Hire day: " + e.getHireDay());
        }
    }

}
