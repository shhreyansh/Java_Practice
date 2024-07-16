
import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        System.out.println("find max and min number\n\n");
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the double type 1st number");
double A_Number=sc.nextDouble();
System.out.println("Enter the double type  2nd number");
double B_Number=sc.nextDouble();
if(A_Number>B_Number)
{
System.out.println("then A_Number is Max and B_Number is Min " );
}
else{
    System.out.println("B_Number is Max and A_number is min");
}

    }
    
}
