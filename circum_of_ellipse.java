
import java.util.Scanner;

public class circum_of_ellipse {
    public static void main(String[] args) {
        System.out.println("circumference of ellipse");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the A");
        double a=sc.nextDouble();
        System.out.println("Enter the B");
        double b=sc.nextDouble();
        double pi=3.14;
        double circum_of_ellipse=pi*(3*(a+b)-Math.sqrt((3*a+b)*(a+3*b)));
        System.out.println("circumference of ellipse is"+circum_of_ellipse);

    }
    
}
