package Manager;

import Employee.Employee;
import Manager.Manager;

public class ManagerTes {
    public  static void main (String[] args){
            //  construct a Manager object
        Manager bouns=new Manager("name",13,2019,12,23);
        bouns.setBonus(123);

        Employee[] staff=new Employee[3];
        //以数组方式引用Employee,ManagerTes方法
        staff[0]=bouns;
        staff[1]=new Employee("Harry Hacker",500000,1989,10,1);
        staff[2]=new Employee("Tommy Tester",40000,1990,3,15);

        //输出所有Manager中的对象
        for(Employee e :staff)  //循环
           System.out.println("name="+e.getName()+",salary="+e.getSalary());
    }
}
