//automatically type conversions apply to overloading
class Overload {
	void test()  {
		System.out.println("No Parameters");
	}

	//overload for int two paramters
	void test(int a, int b) {
		System.out.println("a and b are : "+ a +"  "+ b);
	}

	//overload for double parameters
	void test(double d) {
		System.out.println("Inside test double d is : "+d);
	}
}
class OverloadingDemoTypeCasting  {
	public static void main(String args[])  {
		Overload overload = new Overload();

		int i=88;

		overload.test();
		overload.test(10,20);
		overload.test(i);  //this invoke test(double) and type conversion of int to double automatically
		overload.test(987.3); //this will invoke test(double)
	}
}