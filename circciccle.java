
import java.util.Scanner;

public class circciccle {
    public static void main(String[] args) {
        System.out.println("circumference of circle\n\n");
        Scanner sc= new Scanner(System.in);
System.out.println("Enter the radius");
double radius=sc.nextDouble();
double pi=3.14;
double circumference=2*pi*radius;
System.out.println("circumference of a circle is: "+circumference);
    }
    
}
