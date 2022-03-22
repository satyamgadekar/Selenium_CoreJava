package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOdd_Num_Array {

	//This program is to find even odd number in array.	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int Num[] = {10,7,6,55,20,30,66,96,97};
		ArrayList<Integer> EvenNum = new ArrayList<Integer>();
		ArrayList<Integer> OddNum = new ArrayList<Integer>();
		
		for(int i = 0; i< Num.length ; i++)
		{
			int Number = Num[i];
			if(Number % 2 == 0)
			{
				EvenNum.add(Number);			
			}
			else
			{
				OddNum.add(Number);
			}
		}
		System.out.println("The even numbers are :" + EvenNum);
		System.out.println("The odd numbers are :" +OddNum);
	}

}
