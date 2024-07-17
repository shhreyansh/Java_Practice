
import java.util.Scanner;

public class Dist {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    System.out.println("ENTER THE COORDINATES");
    
     double X1=sc.nextDouble();
    System.out.println("x1="+X1);
    double X2=sc.nextDouble();
    System.out.println("x2="+X2);
    
    System.out.println("The coodinates of first point is: "+X1+","+X2);
    double Y1=sc.nextDouble();
    System.out.println("Y1="+Y1);
    Double Y2=sc.nextDouble();
    System.out.println("Y2="+Y2);
    System.out.println("the coordinates of second point is: "+Y1+","+Y2);
     double sq= Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
    System.out.println("");
     System.out.println("Distance is: "+sq);
    }
}
