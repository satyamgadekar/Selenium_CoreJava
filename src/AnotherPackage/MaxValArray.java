package AnotherPackage;

import java.util.Arrays;
import java.util.List;

public class MaxValArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num[] = {3 ,5, 200, 8, 10, 100, 1000};
		
		int MaxValue = Num[0];
		
		for(int i= 1; i<Num.length; i++)
		{
			if(Num[i] > MaxValue)
			{
				MaxValue = Num[i];
			}
		}
		
		System.out.println("The maximum value is:" + MaxValue);
		
		
		double Num1[] = {5000, 6000, 1000, 2000, 7000};
		double MaxVal1 = Num1[0];
		
		for(int j = 1; j<Num1.length; j++)
		{
			if(Num1[j] > MaxVal1)
			{
				MaxVal1 = Num1[j];
			}
			
		}
		System.out.println(MaxVal1);
		
		
		
	}
	
	

}
