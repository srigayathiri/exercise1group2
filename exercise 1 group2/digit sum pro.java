import java.util.Scanner;
public class Digits {

public static void main(String args[]) {
 Scanner in = new Scanner(System.in);
 System.out.println("Digits Sum and Product");
 System.out.println("-----------------------");
 System.out.print("Enter Number: ");
 int number = in.nextInt();
 int remainder, sum=0, product=1;
 for (int temp=number; temp!=0; temp = temp / 10){
 remainder = temp % 10;
 sum = sum + remainder;
 product = product * remainder;
 }
 System.out.println("Sum of digits of Number '"+number+"'': "+sum);
 System.out.println("Product of digits of Number '"+number+"'': "+product);
}
 } 