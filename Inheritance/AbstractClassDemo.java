//using abstract methods and classess

abstract class Figure  {
	double dim1;
	double dim2;

	Figure(double d1, double d2)  {
		dim1 = d1;
		dim2 = d2;
	}

	//area is now an abstract method
	abstract double area();
}

class Rectangle extends Figure  {
	Rectangle(double a, double b)  {
		super(a,b);
	}

	//override area for rectangle
	double area()  {
		System.out.println("Inside area of Rectangle");
		return dim1 * dim2;
	}
}

class Triangle extends Figure  {
	Triangle(double a, double b)  {
		super(a,b);
	}

	//override area for triangle
	double area()  {
		System.out.println("Inside area of Triangle");
		return dim1 * dim2 / 2;
	}
}

class AbstractClassDemo  {
	public static void main(String args[])   {
		Triangle triangle = new Triangle(10, 8);

		Rectangle rectangle = new Rectangle(9,5);

		Figure figure = triangle;
		System.out.println("Area of Triangle = "+figure.area());

		System.out.println();

		figure = rectangle;
		System.out.println("Area of Rectangle = "+figure.area());
	}
}

/*
		Output  : - 

		Inside area of Triangle
		Area of Triangle = 40.0

		Inside area of Rectangle
		Area of Rectangle = 45.0

*/