/*15. Write a Java program to swap two variables.
*/
class Swap
{
	public static void main(String args[])
	{
		int x=10;
		int y=20;
		int temp;
		
		System.out.println("Before swaping value of x=" +x );
		System.out.println("Before swaping value of y=" +y );
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swaping value of x=" +x );
		System.out.println("After swaping value of y=" +y );
	}
}