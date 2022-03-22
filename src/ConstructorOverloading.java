public class ConstructorOverloading {

	ConstructorOverloading(int a,int b)
	{
		System.out.println("----------This constructor overloading------------ ");
		System.out.println(a+b);
	}
	ConstructorOverloading(int a,double b)
	{
		System.out.println(a+b);
	}
	ConstructorOverloading(double a,int b)
	{
		System.out.println(a+b);
	}
	
	ConstructorOverloading(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading cobj=new ConstructorOverloading(100,200);
		ConstructorOverloading cobj1=new ConstructorOverloading(100,200.5);
		ConstructorOverloading cobj2=new ConstructorOverloading(100.5,200);
		ConstructorOverloading cobj3=new ConstructorOverloading(100,200,300);
	}

}