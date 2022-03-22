public class MethodOverloading {	
	/* Method overloading= we know that the poly-morphism is a concept and overloading is an
	approach of obtaining polymorphism.
	* overloading=simply nothing but we can create number of methods and constructor with
	same name but taking
	* different parameter is called method or constructor over riding.
	*/
	void show(int a,int b)
	{
	System.out.println("--------------THis is method overloading-------------------");
	System.out.println(a+b);
	}
	void show(int a,double b)
	{
	System.out.println(a+b);
	}
	void show(double a,int b)
	{
	System.out.println(a+b);
	}
	void show(int a,int b,int c)
	{
	System.out.println(a+b+c);
	}	
	public static void main(String[] args) {
				
		MethodOverloading mobj1=new MethodOverloading();
		 mobj1.show(10, 20);
		 mobj1.show(10, 20.5);
		 mobj1.show(10.5, 20);
		 mobj1.show(10, 20,30);		
		}
	}
