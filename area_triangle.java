
import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First_angle: ");
        double first_angle=sc.nextDouble();
        System.out.println("Enter the Second_angle: ");
        double Second_angle=sc.nextDouble();
        System.out.println("Enter the third_angle: ");
        double third_angle=sc.nextDouble();
        double s=(first_angle+Second_angle+third_angle)/2;
        System.out.println("s is: "+s);
        double area_of_triangle=Math.sqrt (s*(s-first_angle)*(s-Second_angle)*(s-third_angle));
System.out.println("Area of triangle is: "+area_of_triangle);
    }
    
}
