package elven_dawood_a2.model;

/**
 *
 * @author Expression elvendawood is undefined on line 11, column 14 in
 * Templates/Classes/Class.java.
 */
public class SalaryEmployee extends Employee {

    double salary;

    public double getSalary() {
        return this.salary;
    }

    public SalaryEmployee(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    /**
     *
     * @return Overriding the calculate Pay method
     */
    @Override
    public double calculatePay() {
        return (salary / 52);
    }

}
