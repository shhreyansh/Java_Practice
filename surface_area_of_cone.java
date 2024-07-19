import java.util.Scanner;

public class surface_area_of_cone {
    
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the radius");
    double r=sc.nextDouble();
    System.out.println("Enter the slant height");
    double l=sc.nextDouble();
    double pi=3.14;
double curved_surface=pi*r*l;
System.out.println("curved surface area is: "+curved_surface);
double total_surface=pi*r*l+pi*r*r;
System.out.println("total surface area is "+total_surface);

}
    
}
