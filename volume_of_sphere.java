import java.util.Scanner;

public class volume_of_sphere {
    public static void main(String[] args) {
        System.out.println(" volume of sphere");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        double Radius=sc.nextDouble();
        
        double pi=3.14;
        double volume_of_sphere=4/3.0*(pi*Radius*Radius*Radius);
        System.out.println(" volume of sphere is: "+volume_of_sphere);
        

    }
}
