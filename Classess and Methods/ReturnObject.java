class Test {
	int a;
	Test(int i) {
		a = i;
	}

	Test incrementByTen()  {
		Test temp = new Test(a + 10);
		return temp;
	}
}
class ReturnObject {
	public static void main(String args[]) {
		Test ob1 = new Test(2);
		Test ob2;
		ob2 = ob1.incrementByTen();

		System.out.println("Ob1 : a = "+ ob1.a);
		System.out.println("Ob2 : a = "+ ob2.a);

		ob2 =ob2.incrementByTen();
		System.out.println("Ob2 after incremant = "+ob2.a);
	}
}