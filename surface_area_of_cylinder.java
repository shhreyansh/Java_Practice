
import java.util.Scanner;

public class surface_area_of_cylinder {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the radius");
    double r=sc.nextDouble();
    System.out.println("Enter the height");
    double h=sc.nextDouble();
    double pi=3.14;
double curved_surface=2*pi*r*h;
System.out.println("surface area is: "+curved_surface);
double total_surface=2*pi*r*h+2*pi*r*r;
System.out.println("total surface area is "+total_surface);

}

}
