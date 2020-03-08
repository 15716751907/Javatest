package Manager;
import Employee.Employee;
/*
继承Employee类
*@param name the employee's name
*@param s the salary
*@param year the hire year
*@param month the hire month
*param day the hire day
 */
public class Manager extends Employee {
    private double bonus;  //私有变量
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus=0;
    }
    public void setBonus(double bonus)
    {
        this.bonus=bonus;
    }
    /*
    继承超类getSalary
     */
    public double getSalart()
    {
        double baseSalary=super.getSalary();  //继承超类需要中的方法,需要super
        return baseSalary+this.bonus;
    }
}
