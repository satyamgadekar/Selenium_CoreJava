public class SuperKeyword_Child extends SuperKeyword_Parent {
	
	String name = "Ananurag Gadekar";
	

	public void GetData()
	{
		//This will refer to child
		System.out.println(name);
		
		//This will refer to parent class variable
		System.out.println(super.name);
		
	}
	
	public void SameMethod()
	{
		super.SameMethod();
		System.out.println("I am from child method.");
	}
	
	public SuperKeyword_Child()
	{
		super();
		System.out.println("I am from child Constructor.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If you see here, we have crated object for child class and it will just refer to child variable not parent.
		//But,if we put super to the variable in object it will call the parent object.
		//If we have two same method, then call paret method in child method by super keword.
		//For constructor just say super(), constructor will get called.But super() must be in first line always.
		
		SuperKeyword_Child Child_1 = new SuperKeyword_Child();
		Child_1.GetData();
		Child_1.SameMethod();
		

	}

}
