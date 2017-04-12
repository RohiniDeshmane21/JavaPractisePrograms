class Test  {
	int a,b;

	Test(int i,int j)  {
		a = i;
		b = j;
	}

	void meth()  {
		a *= 2;
		b *= 4;

		System.out.println("In meth call "+ a +" , "+b);
	}
}

class CallByRefDemo  {
	public static void main(String args[])  {
		Test test = new Test(15,20);
		System.out.println("Before call test.a and test.b are = "+ test.a +" , "+test.b );
		test.meth();
		System.out.println("After cal test.a and tes.b are = "+test.a +" , "+test.b);
	}
}

/*
Output : -

Before call test.a and test.b are = 15 , 20
In meth call 30 , 80
After cal test.a and tes.b are = 30 , 80

*/