class IncrementDemo
{
	public static void main(String args[])
	{
		int a = 1;
		int b = 2;
		int c;
		int d;

		c = ++b;  //3
		d = a++;  //1

		c++;  //4

		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
	}	
}