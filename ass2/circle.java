/*11. Write a Java program to print the area and perimeter of a circle. 
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
class circle
{
    public static void main(String args[])
    {
     double rad=7.5;
	 double peri;
	 double area;
	 
	 peri=(2*Math.PI*7.5);
	 area=((Math.PI)*7.5*7.5);
	 System.out.println("perimeter is="+peri);
	 System.out.println("area is="+area);
	 }
}