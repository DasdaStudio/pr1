import Exceptions.FieldLengthLimitException;
import Exceptions.IncorrectSalaryException;

public class Employee {

    protected int id;
    protected static int nextId = 1;
    protected String name;
    protected String surname;
    protected double salary;

    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = nextId++;

        if(name.length()>15 || surname.length()>15){
            throw new FieldLengthLimitException("ID" + id + ": Name must be less then 15 symbols");
        } else {
            this.name = name;
            this.surname = surname;
        }

        if(salary <= 0){
            throw new IncorrectSalaryException("ID" + id + ": Salary must be a positive number");
        } else {
            this.salary = salary;
        }
    }
}
