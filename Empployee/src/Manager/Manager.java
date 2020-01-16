package Manager;
import Employee.Employee;

public class Manager extends Employee {
    private double bonus;
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);


    }
    public void setBonus(double bonus)
    {
        this.bonus=bonus;
//        return this.bonus;
        System.out.println(this.bonus);
    }

}
