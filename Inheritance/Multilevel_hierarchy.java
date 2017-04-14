class Box  {
	private double width;
	private double hight;
	private double depth;

	//construct when clone of an object
	Box(Box b)  {
		width = b.width;
		hight = b.hight;
		depth = b.depth;
	}

	//constructor used when diamensions specified
	Box(double w, double h, double d)  {
		width = w;
		hight = h;
		depth = d;
	}

	//constructor when no dimensions specified
	Box()  {
		width = hight = depth = -1;
	}

	//constructor used when cube is created
	Box(double len)  {
		width = hight = depth = len;
	}

	//volume of box 
	double volume()  {
		return width * hight * depth;
	}
}

//add weight
class BoxWeigth  extends Box  {
	double weight;

	//clone of an object
	BoxWeigth(BoxWeigth bw)  {
		super(bw);
		weight = bw.weight;
	}

	//when diamensions specified
	BoxWeigth(double w, double h, double d, double we)  {
		super(w,h,d);
		weight = we;
	}

	//no diamensions specified
	BoxWeigth()  {
		super();
		weight = -1;
	}

	//constructor used when cube is created
	BoxWeigth(double len, double we)  {
		super(len);
		weight = we;
	}
}

//add shipping cost
class Shipping extends BoxWeigth  {
	double cost;
	Shipping(Shipping sh)  {
		super(sh);
		cost = sh.cost;
	}

	Shipping(double w, double h, double d, double we, double co) {
		super(w,h,d,we);
		cost = co;
	}

	Shipping()  {
		super();
		cost = -1;
	}
	Shipping(double len, double we, double c)  {
		super(len,we);
		cost = c;
	}
}

class Multilevel_hierarchy  {
	public static void main(String args[])  {
		Shipping  shipping1 = new Shipping(10,20,15,10,3.41);

		Shipping shipping2 = new Shipping(2,3,4,0.76,1.28);

		double vol;

		vol = shipping1.volume();
		System.out.println("Volume of shipping1 is = "+vol);
		System.out.println("Weight of shipping1 is = "+shipping1.weight);
		System.out.println("Cost of shipping1 is = "+shipping1.cost);

		System.out.println();

		vol = shipping2.volume();
		System.out.println("Volume of shipping1 is = "+vol);
		System.out.println("Weight of shipping1 is = "+shipping2.weight);
		System.out.println("Cost of shipping1 is = "+shipping2.cost);		
	}
}

/*
	Output  :-

	Volume of shipping1 is = 3000.0
	Weight of shipping1 is = 10.0
	Cost of shipping1 is = 3.41

	Volume of shipping1 is = 24.0
	Weight of shipping1 is = 0.76
	Cost of shipping1 is = 1.28

*/