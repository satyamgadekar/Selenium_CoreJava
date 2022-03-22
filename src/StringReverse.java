
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Most of the time interviewer ask the question to reverse the string.
		 * We acn reverse the string, with each letter on different line, but sometimes they want us to
		 * do panamandrome, where all letter in reverse but as a word.
		 */
		
		String A = "Satyam";
		String B = "";
		
		for(int i = A.length()-1 ; i>=0 ; i--) 
		
		{
			
			//with this the output is produced as letter on single line
			System.out.println(A.charAt(i));
			
			//by creating one blank string named B and and just concatinating or adding one letter 
			//to another we can paramondrom the string easily.
			
			B = B + A.charAt(i);
		
		}
		
		System.out.println(B);
		System.out.println(A.length());

		
		

	}
	
	
}
