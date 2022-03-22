package exercise;

public class MinVal_InArray {

	//This program is basically used to find max value in array.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num[] = {100,250,500,-75,700,900,600,-150};
		int MinVal = Num[0];
		
		for(int i = 0; i< Num.length; i++)
		{
			if(Num[i] < MinVal)
			{
				MinVal = Num[i];
			}
		}
		System.out.println("The minimum value in array is : " +MinVal);

	}

}
