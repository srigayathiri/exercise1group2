import java.util.*;
public class min {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if(a<b && a<c)
            System.out.printf("%d is smallest",a);
        else if(b<c)
            System.out.printf("%d is smallest",b);
        else
            System.out.printf("%d is smallest",c);
           
           
       
    } 
   
}
