/*7. Write a Java program that takes a number as input and prints its multiplication 
table upto 10. 
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/
import java.util.*;
class Table
{
     public static void main(String args[])
   {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter Number=");
     int n=sc.nextInt();
     for(int i=1;i<=10;i++)
      {
       int x;
       x=n*i;
       System.out.println(+n+ "*" +i+ "="+x);
      }
	}
 }