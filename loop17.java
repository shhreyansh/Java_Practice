
import java.util.Scanner;

public class loop17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n");
        int n=sc.nextInt();
        int space=1;
        int star=n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                  System.out.print("*");
                    }
            for(int k=1;k<=space;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=star;l++){  
                System.out.print("*");
            }
            if(i<=(n/2)){
                star=star-1;
                space=space+1;
            }
            else{
                star=star+1;
                space=space-1;
            }

            System.out.println();
        }
        
    }
    
}  
