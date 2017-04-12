class Overload {
	void test()  {
		System.out.println("No paramters ");
	}

	void test(int a, int b)  {
		System.out.println("a = "+ a + ", b = "+b);
	}

	void test(int a)  {
		System.out.println("a = "+a);
	}

	double test(double d1, double d2)  {
		System.out.println("double d1 = "+d1 + " , d2 = "+d2);
		return d1 * d2;
	}
}

class MethodOverloadingDemo  {
	public static void main(String args[])  {
		Overload overload = new Overload();

		//call all versions of test
		overload.test();
		overload.test(3);
		overload.test(9,4);
		double result = overload.test(3.8, 4.8);
		System.out.println("Double multiplication = "+ result);
	}
}