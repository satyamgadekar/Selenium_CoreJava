import java.util.HashMap;

public class FinalKeyword {
	
	//WE can use final keyword in variable, method and in class.
	//If we use final keyword in variable then we cannot assign any value to that variable again.
	//If we use final keyword to method, then we cant override that method.
	//If we use final keyword to class we cant extend or use as parent class.That is cant inheritate.
	
	final String State = "Karnataka";
	
	public final void GetData()
	{
		System.out.println(State);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> has = new HashMap<Integer, String>();
		
		FinalKeyword FinK = new FinalKeyword();
		
		FinK.GetData();

	}

}
