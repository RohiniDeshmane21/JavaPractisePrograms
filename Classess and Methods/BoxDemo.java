class Box {
	double width;
	double hight;
	double depth;
}
class BoxDemo  {
	public static void main(String args[])  {
		Box myBox1 = new Box();
		Box myBox2 = new Box();

		double vol;

		//assing values to myBox1;
		myBox1.width = 10;
		myBox1.hight = 20;
		myBox1.depth = 15;

		//assign different values to myBox2
		myBox2.width = 3;
		myBox2.hight = 6;
		myBox2.depth = 9;

		//compute volume of first box 
		vol = myBox1.width * myBox1.hight * myBox1.depth;
		System.out.println("volume of first box is = "+vol);

		//compute volume of second box
		vol = myBox2.width * myBox2.hight * myBox2.depth;
		System.out.println("volume of second box is  = "+vol);
	}
}