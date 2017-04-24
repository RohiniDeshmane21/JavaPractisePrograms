//One interface can be extend another interface
interface A  {
	void meth1();
	void meth2();
}

interface B extends A {
	void meth3();
}

class MyClass implements B  {
	public void meth1()  {
		System.out.println("Implement meth1");
	}

	public void meth2()  {
		System.out.println("Implement meth2");
	}

	public void meth3()  {
		System.out.println("Implement meth3");
	}
}

class InterfaceExtends  {
	public static void main(String args[])  {
		MyClass myclass = new MyClass();

		myclass.meth1();
		myclass.meth2();
		myclass.meth3();
	}	
}

/*
		Output  :- 

		Implement meth1
		Implement meth2
		Implement meth3
*/