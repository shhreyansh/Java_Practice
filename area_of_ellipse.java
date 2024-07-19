
import java.util.Scanner;

public class area_of_ellipse {
    public static void main(String[] args) {
        System.out.println("Area of ellipse");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the A");
        double a=sc.nextDouble();
        System.out.println("Enter the B");
        double b=sc.nextDouble();
        double pi=3.14;
        double Area_of_ellipse=pi*a*b;
        System.out.println("Area of ellipse is: "+Area_of_ellipse);

    }
    
}
