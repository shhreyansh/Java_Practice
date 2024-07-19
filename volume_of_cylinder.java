import java.util.Scanner;

public class volume_of_cylinder {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the radius");
    double r=sc.nextDouble();
    System.out.println("Enter the height");
    double h=sc.nextDouble();
    double pi=3.14;
double cylinder=pi*r*r*h;
System.out.println("volume of cylender: "+cylinder);
}
}