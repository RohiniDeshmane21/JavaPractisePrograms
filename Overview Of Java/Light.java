class Light
{
	public static void main(String args[])  {
		int lightSpeed;
		long days;
		long seconds;
		long distance;
		
		//speed of light in miles per seconds
		lightSpeed = 186000;
		days = 1000;  //specify number of days
		seconds = days * 60 * 24 *60;  //convert seconds
		distance = seconds * lightSpeed; //compute distance
		System.out.print("In " +days);
		System.out.print(" days light will travel");
		System.out.println("distance :  "+distance);
	}
}