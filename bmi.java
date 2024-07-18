
import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        System.out.println("BMi calculator");
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the weight in kilograms: ");
        double weight=sc.nextDouble();
        System.out.print("enter the height in M: ");
        double height=sc.nextDouble();
        double Bmi=weight/(height*height);
        System.out.println("BMI is:"+Bmi);
        System.out.println(weight+"kilo weight me "+height+" meter height me itna bmi calculate hua"+Bmi);

    }
    
}
