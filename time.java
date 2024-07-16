
import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the seconds: ");
        int seconds =sc.nextInt();
        
        
        int min=seconds/60;
        

        int hour=min/60;
        

        int final_sec=seconds%60;
        System.out.println("Sec is: "+final_sec);
         
        int final_min=min%60;
        System.out.println("Min is: "+final_min);

        int final_hr=hour%60;
        System.out.println("hour is: "+final_hr);

        
         
         
    }
    
}
