
public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * exceptions are used to handle the irregular situtions.
		 * try block must be followed by catch block.
		 * one try can be followed by multiple catch block.
		 * 
		 * Ex. Suppose if alert is popping up sometime and sometime not.In that case, we use alert catching
		 * script in try block and if the script where alert is not present in catch block.
		 * 
		 * Now, in below example if we see a/b is infinity, so put it in try block and if try failed to attempt 
		 * that code, then other code we placed in catch block.
		 */
		
		try
		{
			//this code will check arithmetic exception.
			int a = 7;
			int b = 0;
			int c = a/b;
			
			System.out.println(c);
			
			
			//this code will check 
			int p[] = new int[5];
			
			System.out.println(p[8]);
			
			
			//if we want to specify we can specify each exception separately.
			
		}
		catch(ArithmeticException et)
		{
			System.out.println("I checked Arithmetic Exception ");
		}
		
		catch(IndexOutOfBoundsException ett)
		{
			System.out.println("I checked Index Out Of Bounds Exception");
		}
		
		catch(Exception e)
		{
			System.out.println("Code went to catch block");
		}
		finally
		{
			//This block is executed irresepective of the exception is thrown or not.
			//when try block fails, it goes to catch block. And if again catch block fails, it will go to finally block.
			//finally block, always gets executed eventhogh scripts fail.
			//we can stop execution of finally block, when we say stop running that time only.
			
			System.out.println("Code went to finally block and it always gets executed.");
		}
		
	}

}
