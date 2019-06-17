package elven_dawood_a2.model;
// Assignment 2
import elven_dawood_a2.model.Employee;

/**
 *
 * @author Expression elvendawood is undefined on line 11, column 14 in
 * Templates/Classes/Class.java.
 */
public class CommissionEmployee extends Employee {

    private double rate;
    private double sales;
    
    /**
     *
     * @return
     */
    public double getRates(){
        return this.rate;
    }
    
    /**
     *
     * @return
     */
    public double getSales(){
        return this.sales;
    }
            
    /**
     *
     * @param id
     * @param firstName
     * @param lastName
     * @param rate
     * @param sales
     */
    public CommissionEmployee(int id, String firstName, String lastName, double rate, double sales) {
        super(id, firstName, lastName);
        
    }

    /**
     *
     * @return Overriding the calculate Pay method
     */
    @Override 
    public double calculatePay() {
        return (this.sales*rate /100);
    }
    
    

}
