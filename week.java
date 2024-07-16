
import java.util.Scanner;

public class week {

    public static void main(String[] args) {
        System.out.println("weekly calender\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number b/w 1 to 7");
        int Day = sc.nextInt();
        if(Day == 1) {
            System.out.println("The day is: Monday");
        } else if (Day == 2) {
            System.out.println("The day is: Tuesday");
        } else if (Day == 3) {
            System.out.println("The day is: Wednesday");
        } else if (Day == 4) {
            System.out.println("The day is: thrusday");
        } else if (Day == 5) {
            System.out.println("The day is: Friday");
        } else if (Day == 6) {
            System.out.println("The day is: Saturday");
        } else if (Day == 7) {
            System.out.println("The day is: Sunday");
        } else {
            System.out.println("INVALID NUMBER");
        }

    }

}
