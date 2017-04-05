//Demonstrating dymnic initialization
class DynInit
{
	public static void main(String args[])
	{
		double a = 3.0, b= 4.0;

		//c is dynamically intialized
		double c = Math.sqrt(a * a + b * b);

		System.out.print("C = "+ c);
	}
}