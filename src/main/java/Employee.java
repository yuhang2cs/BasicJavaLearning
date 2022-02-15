import java.util.Date;

public class Employee extends People {

    private int salary;

    public Employee(int age) {
        super(age);
    }

    public Employee(int age, String name, float balance, boolean sex, Date birthDay,int salary) {
        super(age, name, balance, sex, birthDay);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int increaseSalary(int increased) {
        salary = salary + increased;
        return salary;
    }

    public
}
