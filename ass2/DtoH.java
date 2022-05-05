import java.util.*;
class DtoH
{
    public static void main(String args[])
	{ 
    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter decimle number="); 	
	    int input=sc.nextInt();
	    char[] hex={'0','1','2','3','4,'5','6','7','8','9','A','B','C','D','E','F'};
	    String hexdec="";
	
	   while(input>0)
	   { 
	  int reminder=input%16;
	  hexdec=hex(reminder)+hex;
	  input=input/16;
	   }
      System.out.print("Binary of first number=" +hexdec);
    }
}
