
import java.util.Scanner;

public class water {
    public static void main(String[] args) {
        System.out.println("annual water tax\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the consumption of water in litre");
        int water=sc.nextInt();
        if(water>45 && water<75)
        {
            System.out.println("apko 475 monthly patt krna pdega");

        }
else if(water>75 && water<150){
    System.out.println("apko 750 monthly patt krna pdega");
}
else if(water>150 && water<300){
    System.out.println("apko 1225 monthly patt krna pdega");
    }
    else if(water>300 && water<350){
        System.out.println("apko 1750 monthly patt krna pdega");
    }
    else{
        System.out.println("Meetup in office");
    }
}
}