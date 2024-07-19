
import java.util.Scanner;

public class surface_area_of_sphere {
    public static void main(String[] args) {
        System.out.println(" surface area of sphere");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        double Radius=sc.nextDouble();
        
        double pi=3.14;
        double surface_area_of_sphere=4*pi*Radius*Radius;
        System.out.println("surface area of sphere is: "+surface_area_of_sphere);
        

    }
    
}

