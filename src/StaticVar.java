public class StaticVar {
	
	//Variables without initialization and which are in direct class are called instance variable.
	//The value will chnage as per object instance is craeted, so called instance var. Ex look obj stvar and stvar1
	//as value for name, address changed from instance to instance ie object to object. 
	//Static method can acces only static stuff see example.
	//Static variables can be defined in a static block.
	
	String name;
	String address;
	String city;
	static String state = "Karnataka";
	
	//This is static block
	static
	{
		int pincode = 413113;
		String route = "MG Road";
	}
	
	//suppose, state for all person will be same. and defining it everytime will take memory and time.
	//so put static keyword.
	
	public StaticVar(String name, String address, String city)
	{
		this.name = name;
		this.address = address;
		this.city = city;
		
		System.out.print(name);
		System.out.print("\t");
		System.out.print(address);
		System.out.print("\t");
		System.out.print(city);
		System.out.print("\t");
		
	}
	
	public void GetAddress()
	{
		System.out.print(address);
		System.out.println("\t");
		System.out.print(state);
		System.out.println("\t");
	}
	
	public static void getstate()
	{
		System.out.print(state);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar stvar = new StaticVar("Satyam","Dwarakanagar","Banglore");
		StaticVar stvar1 = new StaticVar("Shivam","ShivajiNagar","Pune");
		stvar.GetAddress();
		stvar1.GetAddress();
		//We can call static variable directly.
		System.out.println(state);
		//WE can call static method directly, w/o object creation.
		getstate();
		//With class name also we can call.
		StaticVar.getstate();
		
	}

}
