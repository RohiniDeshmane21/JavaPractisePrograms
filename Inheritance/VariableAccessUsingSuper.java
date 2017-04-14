class Animal  {
	String color = "Red";
}

class Dog extends Animal {
	String color = "Red Dog";

	void printColor()  {
		System.out.println(color); // print child class color variable
		System.out.println(super.color);  //print parent class color variable 
	}
}

class VariableAccessUsingSuper
{
	public static void main(String args[])  {
		Dog dog = new Dog();
		dog.printColor();
	}	
}

/*  Output
Red Dog
Red  
*/