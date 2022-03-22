package exercise;

public class MaxVal_InArray {

	//This program is basically used to find max value in array.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num[] = {100,250,500,-75,700,900,600,-150};
		int MaxValue = Num[0];
		
		for(int i=0 ; i<Num.length; i++)
		{
			if(Num[i] > MaxValue)
			{
				 MaxValue = Num[i];
			}
		}
		System.out.println("The maximum value in array is :" + MaxValue);
	}

}
