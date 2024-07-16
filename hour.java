
import java.util.Scanner;

public class hour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of seconds ");
        int seconds=sc.nextInt();
        int total_min=seconds/60;
        System.out.println("total_minute is: "+total_min);
          int min=total_min%60;
        System.out.println("minute: "+min);
        int hour=total_min/60;
        System.out.println("hour: "+hour);
        int final_seconds=seconds%60;
        System.out.println("second is: "+final_seconds);
        System.out.println();
        
        System.out.print("hour: "+hour);
        System.out.print("  minute: "+min);
        System.out.print("  seconds"+final_seconds);

    }
    
}
