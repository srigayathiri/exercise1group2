import java.util.Scanner;
public class greeting{
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the mark");
        int a=obj.nextInt();
        switch(a)
        {
            case 10:
                System.out.println("Excellent");
            break;
            case 9:
            case 8:
                System.out.println("Very Good");
            break;
            case 7:
            case 6:
                System.out.println("Good");
            break;
            case 5:
            case 4:
            case 3:
                System.out.println("Very Poor");
            break;
            case 2:
            case 1:
            case 0:
                System.out.println("Poor");
            break;
            default:
                    System.out.println("incorrect option(ENTER THE MARK OUT OF 10)");
        }
       
    }
}