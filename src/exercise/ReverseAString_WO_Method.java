package exercise;

public class ReverseAString_WO_Method {

	//Reverse a string without Using String methods (Here we will use ToCharArray())  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name = "Satyam";
		String ReverseName = "";
		
		char NameArray[] = Name.toCharArray();
		
		for(int i = NameArray.length-1; i >= 0; i--)
		{
			ReverseName = ReverseName + NameArray[i];
		}
		
		System.out.println(ReverseName);
		

	}

}
