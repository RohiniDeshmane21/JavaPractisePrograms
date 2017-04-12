//superclass
class A  {
	int i,j;

	void showij()  {
		System.out.println("i and j are = "+i+" , "+j);
	}
}

//subclass which extends class A
class B extends A {
	int k;

	void showk()  {
		System.out.println("k is = "+ k);
	}

	void sum()  {
		System.out.println(" i+j+k = "+(i+j+k));
	}
}

class SimpleInheritance  {
	public static void main(String args[])  {
		A superObj = new A();
		B subObj = new B();

		//assign values to super class variables
		superObj.i = 10;
		superObj.j = 20;
		System.out.println("Content of superclass variables i and j are : ");
		superObj.showij();

		System.out.println();

		//assign values to sub class variables and access super class variables and methods also.
		subObj.i = 7;
		subObj.j = 8;
		subObj.k = 9;
		System.out.println("Content of subclass variables i, j and ke are : ");
		subObj.showij();
		subObj.showk();

		System.out.print("Sum of i, j , k  = ");
		subObj.sum();
	}	
}

/*
Content of superclass variables i and j are :
i and j are = 10 , 20

Content of subclass variables i, j and ke are :
i and j are = 7 , 8
k is = 9
Sum of i, j , k  =  i+j+k = 24

*/