
import java.util.Scanner;

public class third_angle {
    public static void main(String[] args) {
        System.out.println("Find third angle/n/n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st angle: ");
        double First_angle=sc.nextDouble();
        System.out.print("Enter the 2nd angle: ");
        double Second_angle=sc.nextDouble();
        double Third_angle=180-(First_angle+Second_angle);
        System.out.println("Third angle is: "+Third_angle);
    }
    
}
