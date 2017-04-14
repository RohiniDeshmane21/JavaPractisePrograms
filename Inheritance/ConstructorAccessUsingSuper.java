class AnimalConstructor  {
	AnimalConstructor() {
		System.out.println("Animal is created");
	}
}

class DogConstructor extends AnimalConstructor  {
	DogConstructor()  {
		super();
		System.out.println("Dog object is created");
	}
}

class ConstructorAccessUsingSuper  {
	public static void main(String args[])  {
		DogConstructor dog = new DogConstructor();
	}
}

/*  
Output

Animal is created
Dog object is created

*/