
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        System.out.println("Find triangle types\n\n");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 1st side of triangle");
int sideA=sc.nextInt();
System.out.println("Enter the 2nd side of the triangle ");
int sideB=sc.nextInt();
System.out.println("Enter the 3rd side of triangle ");
int sideC=sc.nextInt();
if(((sideA!=sideB)&&(sideB!=sideC))&&(sideC!=sideA))
{
    System.out.println("this is scalene");
}
else if(((sideA==sideB)&&(sideB==sideC))&&(sideC==sideA))
{
System.out.println("this is equilateral");
    }
    else{
        System.out.println("this is isoceles");
    }



}
}