/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and 
remainder of two numbers. 
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
import java.util.*;
class Operations2
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter First value=");
int n1=sc.nextInt();
System.out.println("Enter Second value=");
int n2=sc.nextInt();
int a=n1+n2;
int b=n1-n2;
int c=n1*n2;
int d=n1/n2;
int e=n1%n2;
System.out.println(+n1+ "+" +n2+ "=" +a);
System.out.println(+n1+ "-" +n2+ "=" +b);
System.out.println(+n1+ "*" +n2+ "=" +c);
System.out.println(+n1+ "/" +n2+ "=" +d);
System.out.println(+n1+ "%" +n2+ "=" +e);
}
}
