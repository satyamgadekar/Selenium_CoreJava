
public class ConstructorDemo {
	/*
	 * Constructor is a special type of method.
	 * Constructor name must be same as class name.
	 * Constructor will never have any return type.
	 * Whenever we will create an object an implicit constructor will get called. Eventhogh the constructor is not there.
	 * Constructor are of two types: Default(Not tanking any parameter) , Parametrized(Taking parameter).
	 * If we have more than 1 constr then we have to call it separately for each constr.
	 * As it does not have any return type, Sysout statement must be Constructor block of code.
	 */
		//Default Constructor:
	public ConstructorDemo()
	{
		System.out.println("I am in Default constructor");
	}
	
	//Parameterized constructor:
	public ConstructorDemo(int x , int y)
	{
		System.out.println("I am in Parameterized1 constructor");
		int z = x+y;
		System.out.println(z);
	}
	
	public ConstructorDemo(String H)
	{
		System.out.println("I am in Parameterized2 constructor");
		System.out.println(H);
	}
	
	public int SaveData(int a, int b)
	{
		return a+b;
	}

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		
		ConstructorDemo ConDem = new ConstructorDemo();
		//Now here we have not called constructor separately eventhogh the constr will get exec.
		
		int Sum = ConDem.SaveData(100, 150);
		System.out.println(Sum);
		
		//This will pick int constructor
		ConstructorDemo ConDem1 = new ConstructorDemo(5,5);
		
		//This will pick String constructor
		ConstructorDemo ConDem2 = new ConstructorDemo("Hello");

	}

}
