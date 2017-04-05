class Box {
	double width;
	double hight;
	double depth;

	//this is constructor for class Box
	Box(double w, double h, double d) { 
		width = w;
		hight = h;
		depth = d;
	}

	//compute and return volume
	double volume() {
		return width * hight * depth;
	}
}
class ConstructorDemo {
	public static void main(String args[]) {

		//declare, allocate and initialize Box objects
		Box b1 = new Box(10,20,15);
		Box b2 = new Box(3,6,9);

		double v;

		//get volume of first box
		v = b1.volume();
		System.out.println("Volume 1 is "+v);

		//get volume of second box
		v = b2.volume();
		System.out.println("Volume 2 is "+v);
	}	
}