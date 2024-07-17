
import java.util.Scanner;

public class area_of_right_angle {
    public static void main(String[] args) {
        System.out.println("area of right angle triangle\n\n");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        double base=sc.nextDouble();
        System.out.println("Enter the perpendicular");
        double perpendicular=sc.nextDouble();
        double area_of_right_angle=(base*perpendicular)/2;
        System.out.println("area of right angle triangle is: "+area_of_right_angle);
    }
    
}
