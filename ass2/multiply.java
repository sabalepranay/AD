/*5. Write a Java program that takes two numbers as input and display the product of 
two numbers. 
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/
import java.util.*;
class multiply
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number=");
int x =sc.nextInt();
//Scanner sc = new Scanner(System.in);
System.out.println("Enter second number=");
int y =sc.nextInt();
int Z=x*y;
System.out.println( +x+ "*" +y+ "=" +Z);
}
}