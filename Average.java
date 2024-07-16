
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        System.out.println("Average\n\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Hindi");
        int Hindi = sc.nextInt();
        System.out.println("Enter the marks of English");
        int English = sc.nextInt();
        System.out.println("Enter the marks of Science");
        int Science = sc.nextInt();
        System.out.println("Enter the marks of Maths");
        int Maths = sc.nextInt();
        System.out.println("Enter the marks of Biology");
        int Biology = sc.nextInt();
        System.out.println();
        int sum = Hindi + English + Science + Maths + Biology;
        System.out.println("Total_marks of all subjects is: " + sum);

        double Average = (sum / 500.0) * 100;
        System.out.println(Average);
        if (Average > 90) {
            System.out.println("grade: A");
        } else if(Average>80){
            System.out.println("Grade:B");
        }
        else if(Average>70){
            System.out.println("Grade:C");
        }
        else if(Average>60){
            System.out.println("Grade:D");
        }
        else if(Average>50){
            System.out.println("Grade:E");
        }
        else if(Average>40){
            System.out.println("Grade:P");
        }
        else {
            System.out.println("Grade:F:FAIL");
        }
    }

}
