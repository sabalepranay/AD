/*17. Write a Java program to add two binary numbers. 
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output
Sum of two binary numbers: 101
*/
import java.util.*;
class binary
{
    public static void main(String args[])
	{    
	   int x=10;
	   int y=11;
	   int bin=0, i=1;
	   int bin1=0;
	   while(x>0)
	  { 
	  int r=x%2;
	  bin =bin+(r*i);
	  x=x/2;
	  i=i*10;
	  }
	  System.out.println("Binary of first number=" +bin);
	   while(y>0)
	  { 
	  int s=y%2;
	  bin1 =bin1+(s*i);
	  y=y/2;
	  i=i*10;
	  }
	  System.out.println("Binary of second number=" +bin1);
	  
	  System.out.println("Addition of two Binary number is=" );
	  
	 
      
	
	}
}