//demo break statement
class BreakDemo
{
	public static void main(String args[])
	{
		boolean b =true;

		first: {
			second: {
				third: {
					System.out.println ("Before the break");
					if(b)
					break second;
					System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}			
			System.out.println("After break");
		}
	}
}