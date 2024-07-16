
import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter Salary: ");
     int salary=sc.nextInt();
      double food=(1/2.0)*salary;
      System.out.println("Money spent on Food: "+food);
      double total_left=salary-food;
      System.out.println("Total Ammount is Left: "+total_left);
      double rent=(1/15.0)*salary;
      System.out.println("Money Spent on Rent: "+rent);
      double total_rent=total_left-rent;
      System.out.println("Left Total Ammount "+total_rent);
      double miscellaneous=(1/10.0)*salary;
      System.out.println("Total Miscellaneous"+miscellaneous);
      double all_total=total_rent-miscellaneous;
      System.out.println("All Total Left Ammount:"+all_total);
      double total_spent=(rent+miscellaneous+food);
      System.out.println("Saving is: " +total_spent);
      double saving=salary-total_spent;
      System.out.println("saving is "+saving);
      
sc.close();



    }
    
}
