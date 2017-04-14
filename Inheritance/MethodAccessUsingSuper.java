class AnimalMethod  {
	void eat()  {
		System.out.println("Eating");
	}
}

class DogMethod extends AnimalMethod  {
	void eat()  {
		System.out.println("Eating bread ... ");
	}

	void bark() {
		System.out.println("Barking ... ");
	}

	void work()  {
		super.eat();
		bark();
	}
}

class MethodAccessUsingSuper  {
	public static void main(String args[])  {
		DogMethod dog = new DogMethod();
		dog.work();
	}
}

/* Output
Eating
Barking
*/