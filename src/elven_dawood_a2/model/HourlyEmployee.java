package elven_dawood_a2.model;

/**
 *
 * @author Expression elvendawood is undefined on line 11, column 14 in
 * Templates/Classes/Class.java.
 */
public class HourlyEmployee extends Employee {

    private double numHours;
    private double hourlyRate;

    public double getNumHours() {
        return this.numHours;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public HourlyEmployee(int id, String firstName, String lastName, double numHours, double hourlyRate) {
        super(id, firstName, lastName);
        this.hourlyRate = hourlyRate;
        this.numHours = numHours;
    }

    /**
     *
     * @return Overriding the calculate Pay method
     */
    @Override
    public double calculatePay() {
        return (this.numHours * this.hourlyRate);
    }
}
