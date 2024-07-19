import java.util.Scanner;

/**
 * volume_of_hemisphere
 */
public class volume_of_hemisphere {

    public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the radius");
    double r=sc.nextDouble();
    double pi = 3.14;
    double volume_of_hemisphere=(pi*r*r*r)/2;
    System.out.println("volume of hemisphere is "+volume_of_hemisphere);
}
}