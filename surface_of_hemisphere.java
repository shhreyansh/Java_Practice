
import java.util.Scanner;



/**
 * surface_of_hemisphere
 */
public class surface_of_hemisphere {
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the radius");
    double r=sc.nextDouble();
    double pi = 3.14;
    double surface_of_hemisphere=3*pi*r*r;
    System.out.println("surface of hemisphere is "+surface_of_hemisphere);
}
}