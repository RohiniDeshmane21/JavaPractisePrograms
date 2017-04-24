interface Callback  {
	public void callback(int a);
}

class client implements Callback  {
	//implement callback's interface
	public void callback(int val)  {
		System.out.println("Callback called with val = "+val);
	}
}

class TestInterface  {
	public static void main(String args[])  {
		Callback call = new client();
		call.callback(42);
	}
}

/*  

		Output  :- 
		
		Callback called with val = 42
*/