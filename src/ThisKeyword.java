public class ThisKeyword {
	
	//this refers to current object - object scope lies in the class level.
	//super brings value from parent class, but this referes to object from the current class.
	
	//This is a global variable.
	int a = 10;
	public void Givedata()
		{
			//This is a local variable.
			int a = 20;
			System.out.println(a);
			System.out.println(this.a);
			
			//if we want to add two variable with same name, we will use this keyword to add
			
			int b = a + this.a;
			System.out.println("The sum of gloabal and local variable a is:" +b);

		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ThisKeyword Thisobj = new ThisKeyword();
		Thisobj.Givedata();
		}
}
