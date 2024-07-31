

public class loop16 {
    public static void main(String[] args) {
       
      int n=5;
        int space=n/2;
       int star=1;
        for(int i=1;i<=5;i++){
for(int j=1;j<=space;j++){
    System.out.print(" ");
}
for(int k=1;k<=star;k++){
    System.out.print("*");
}
if(i<=(n/2)){
    star=star+2;
    space--;
}
else{
    star=star-2;
    space++;
    
}
System.out.println();
        }
        
    }
}
