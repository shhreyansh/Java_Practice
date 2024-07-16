
import java.util.Scanner;

public class year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the seconds");
        int second=sc.nextInt();
        int min=second/60;
        System.out.println("minute is: "+min);
        int hr=min/60;
        System.out.println("hour is: "+hr);
        int day=hr/24;
        System.out.println("day is: "+day);
        int week=day/7;
        System.out.println("week is: "+week);
        int month=day/30;
        System.out.println("month is: "+month);
int year=month/12;
System.out.println("year: "+year);

/*int final_min=second%60;
System.out.println("final_min: "+final_min); 
int final_hr=min%60;
System.out.println("final_hour is: "+final_hr);
int final_day=hr%24;
System.out.println("final_day : "+final_day);
int final_week=day%7;
System.out.println("final_week: "+final_week);
int final_month=day/30;
System.out.println("final_month is: "+final_month);
int final_year=month%12;
System.out.println("final_year: "+final_year);*/

System.out.print(" year: "+year);
System.out.print(" month: "+month);
System.out.print(" week: "+week);
System.out.print(" day: "+day);
System.out.print(" hour: "+hr);
System.out.print(" minute: "+min);
System.out.print(" second: "+second);    
}
}