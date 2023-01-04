import Exceptions.FieldLengthLimitException;
import Exceptions.IncorrectSalaryException;

public class Demo {

    public static void main(String[] args) {

        try{
            Employee employee1 = new Employee("John", "Snow", 4500);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }

        try{
            Employee employee2 = new Employee("Aria", "Stark", -20);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }

        try{
            Employee employee1 = new Employee("Daenerysssssssss", "Targaryen", 4500);
        } catch (FieldLengthLimitException e){
            System.out.println(e.getMessage());
        } catch (IncorrectSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}
