/*19. Write a Java program to convert a decimal number to binary number. 
Input Data:
Input a Decimal Number : 5
Expected Output
*/

import java.util.*;
class Decitobin
{
    public static void main(String args[])
	{ 
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimle number="); 	
	    int x=sc.nextInt();
	   
	    int bin=0, i=1;
	
	   while(x>0)
	  { 
	  int r=x%2;
	  bin =bin+(r*i);
	  x=x/2;
	  i=i*10;
	  }
	    System.out.println("Binary of first number=" +bin);
	  }
}