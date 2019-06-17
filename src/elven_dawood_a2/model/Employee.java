package elven_dawood_a2.model;

/**
 *
 * @author Expression elvendawood is undefined on line 11, column 14 in
 * Templates/Classes/Class.java.
 */
public abstract class Employee {

    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id, String firstName, String lastName) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(int id) {

        this.id = id;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public abstract double calculatePay();

    /**
     *
     * @return Overriding the to String Method
     */
    @Override
    public String toString() {

        String format = "Employee %d: %s %s";

        return String.format(format, id, firstName, lastName);
    }

    public String toString(int num) {
        String format = "Weekly pay for %s, %s employee id %s is $%.2f\n";
        return String.format(format, this.getLastName(), this.getFirstName(), this.getId(), this.calculatePay());
    }
}
