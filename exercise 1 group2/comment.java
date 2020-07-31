import java.util.*;
public class digit
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("enter a decimal");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i=0,r;
        while(n>0)
        {
         r=n%10;
         i++;
        n=n/10;    
        }
        if (i==1)
        System.out.printf("the decimal is of %d digit",i);
        else
        System.out.printf("the decimal is of %d digits",i);
    }
}


