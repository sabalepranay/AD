import java.util.*;
class Binary12
{
public static void main(String arg[])
{ 
     int n; 
    Scanner sc = new Scanner(System.in);
	 System.out.println("Enter decimal number:");
	
    String bin=sc.next();
	
	  while(bin>0)
	  { 
	  int r=n%2;
	  bin =bin+r;
	  n=n/2;
	  }
	  System.out.println("bin");
      
}
}
 