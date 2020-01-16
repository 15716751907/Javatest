//package linpenf;
import java.time.*;


public class linpengceshidate {
    /**
     * @version 1.5 2019-12-20
     * @author  Cay Horstman
     */
    public static void main(String[] args){
        LocalDate date=LocalDate.now();
        int month=date.getMonthValue();
        int today=date.getDayOfMonth();

        date=date.minusDays(today-1);
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();

        System.out.println("Mon Tue Wed THU Fri Sat Sun");
        for (int i=1;i<value;i++)
            System.out.print("    ");
        while (date.getMonthValue()==month);
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth()==today)
                System.out.print("*");
            else
                System.out.print(" ");
            if (date.getDayOfWeek().getValue()==1) System.out.println();
        }
        if (date.getDayOfWeek().getValue()!=1) System.out.println();
    }
}
