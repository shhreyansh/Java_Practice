
import java.util.Scanner;

public class lic_no {
    public static void main(String[] args) {
        System.out.println("to find lic_no,annual income,discount,taxable income,education tax and total tax");
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Lic_no of 6 Digit");
        double lic_no=sc.nextDouble();
        System.out.println("Enter the Monthly income of the shopkepper");
        double Monthly_income=sc.nextDouble();
        double annual_income=12*Monthly_income;
        System.out.println("Annual Income : "+annual_income);
        double discount =(20/100.0)*annual_income;
        System.out.println("discount  is : "+discount);
        double education_tax=(1/100.0)*annual_income;
        System.out.println("Education Tax: "+education_tax);
        double taxable_income=annual_income-discount+education_tax;
        System.out.println("Taxable_Tax: "+taxable_income);





    }
    
}
