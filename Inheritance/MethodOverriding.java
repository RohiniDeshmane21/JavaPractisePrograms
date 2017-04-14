//method overriding
class AClass  {
	int i,j;
	AClass(int a, int b)  {
		i = a;
		j = b;
	}

	void show()  {
		System.out.println("i = "+i + " j = "+j);
	}
}

class BClass extends AClass  {
	int k;
	BClass(int a, int b, int c)  {
		super(a,b);
		k = c;
	}

	void show()   {
		System.out.println("k = "+k);
	}
}

class MethodOverriding  {
	public static void main(String args[])  {
		BClass b = new BClass(10,20,30);

		b.show();  ///this call show() in BClass

	}
}

/*
		Output : = 

		k = 30
*/