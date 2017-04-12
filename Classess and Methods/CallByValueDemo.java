class Test {
	void meth(int i, int j)  {
		i *= 2;
		j *= 4;
		System.out.println("In Meth method : i and j are = "+ i +" , "+j);
	}
}
class CallByValueDemo  {
	public static void main(String args[])  {
		Test ob = new Test();

		int a = 15, b = 20;

		System.out.println("Before function call i and j are = "+a +" , "+b);

		ob.meth(15,20);

		System.out.println("After function call  i and j are = "+a +" , "+b);
	}
}

/*
Output : -
Before function call i and j are = 15 , 20
In Meth method : i and j are = 30 , 80
After function call  i and j are = 15 , 20

*/