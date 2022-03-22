package exercise;

public class DuplicateVal_InString {
	//This program is used to find duplicate value in String.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = "I am giving interview";
		int Count;
		//Converts given string into character array
		char string[] = string1.toCharArray();  
		//Counts each character present in the string
		for(int i = 0; i<string.length; i++)
		{
			Count=1;
			for(int j = i+1; j<string.length; j++)
			{
				if(string[i] == string[j] && string[i] != ' ')
				{
					Count++;
					//Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			//A character is considered as duplicate if count is greater than 1
			if(Count > 1 && string[i] != '0')
			{
				System.out.println(string[i]);
			}
		}
	}
}
