/*12. Write a Java program that takes three numbers as input to calculate and print the 
average of the numbers.
*/
import java.util.*;
class avrg
{
   public static void main(String args[])
    {
      int avrg;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter First num=");
      int n1=sc.nextInt();
      System.out.println("Enter Second num=");
      int n2=sc.nextInt();
      System.out.println("Enter Third num=");
      int n3=sc.nextInt();
      avrg=(n1+n2+n3)/3;
	  System.out.println("Average of 3 num is="+avrg);
	  }
}	  
	  