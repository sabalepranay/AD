/*20. Write a Java program to convert a decimal number to hexadecimal number. 
Input Data:
Input a decimal number: 15
Expected Output
Hexadecimal number is : F
*/
import java.util.Scanner;
class Dtohexa
{
    public static void main(String args[])
	{ 
    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimle number="); 	
	    int input=sc.nextInt();
	    char[] hex={'0','1','2','3','4,'5','6','7','8','9','A','B','C','D','E','F'};
	    //string hexdec=" ";
	
	   while(input>0)
	   { 
      String hexdec=" ";
	  int reminder=input%16;
	  hexdec=hex(reminder)+hex;
	  input=input/16;
	   }
      System.out.print("Binary of first number=" +hexdec);
    }
}
