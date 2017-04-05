class TypeCastingDemo
{
	public static void main(String args[])
	{
		byte b;
		double d = 323.142;
		int i= 257;

		System.out.println("\n\n Conversion of int to byte");
		b = (byte)i;
		System.out.println("\n i and b are = "+ i +"  " + b);

		System.out.println("\n\n Conversion of double to int");
		i = (int)d;
		System.out.println("\n i and d are = "+i +"  "+d);

		System.out.println("\n\n Conversion of double to byte");
		b = (byte) d;
		System.out.println("\n b and d are = "+b +"  "+d);

	}
}