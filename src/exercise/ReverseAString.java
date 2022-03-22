package exercise;

public class ReverseAString {
	
	//This program is basically to reverse a string with using any String Method.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name = "Interview";
		String ReverseName = "";
		
		for(int i = Name.length()-1; i>=0; i--)
		{
			Name.charAt(i);
			ReverseName = ReverseName + Name.charAt(i);			
		}
		System.out.println(ReverseName);

	}

}
