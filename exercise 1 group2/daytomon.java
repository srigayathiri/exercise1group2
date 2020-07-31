import java.util.Scanner;
public class DayMonthProgram {  
      public static void main(String[] args) {  
          System.out.println("enter the number of days");
          Scanner obj = new Scanner(System.in);
           int num=obj.nextInt();
           int days = num % 30;  
           int month = num / 30;  
           System.out.println(num + " days = " + month + " Month and " + days  
                     + " days");  
      }  
 }  