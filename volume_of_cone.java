import java.util.Scanner;

public class volume_of_cone {
 public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the radius");
    double R=sc.nextDouble();
    System.out.println(" enter the height");
    double h=sc.nextDouble();
    double pi=3.14;
    double volume_of_cone=(pi*R*R*h)/3;
    System.out.println("volume of cone is "+volume_of_cone);   
}
}