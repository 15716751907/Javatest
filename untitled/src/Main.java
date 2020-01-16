import java.time.DayOfWeek;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        int month=date.getMonthValue();  //获取当前月份
        int today=date.getDayOfMonth();  //获取今天日期
        System.out.println(today);
        System.out.println(month);
        date=date.minusDays(today-1);  //找到1号日期
        System.out.println(date);
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();  //算计第一天是周几
        System.out.println(value);

        System.out.println("Mon Tue Wed THU Fri Sat Sun");
        for (int i=1;i<value;i++)
            System.out.print("    ");  //前面以空格不起，方便位置对应
//        System.out.print(date.getDayOfMonth());
//
//        int Monthe=date.getMonthValue();
        while (date.getMonthValue()==month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth()==today)
                System.out.print("*");
            else
                System.out.print(" ");
            date=date.plusDays(1);
            if (date.getDayOfWeek().getValue()==1) System.out.println();
//            break;
        }
        if (date.getDayOfWeek().getValue()!=1) System.out.println();
	// write your code here
    }
}


