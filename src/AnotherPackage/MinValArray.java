package AnotherPackage;

public class MinValArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num[] = {100, 150, 300, 250, 1, 400};
		
		int MinVal = Num[0];
		
		for(int i=1; i<Num.length; i++)
		{
			if(Num[i] < MinVal) 
			{
				MinVal = Num[i];
			}
		}
		
		System.out.println("The minimum value of array is:" + MinVal);
		
		int Num1[] = {200, -350, 50, 75, 0, -100};
		int MinVal1 = Num1[0];
		
		for(int j = 1; j<Num1.length; j++)
		{
			if(Num1[j] < MinVal1)
			{
				MinVal1 = Num1[j];
			}
		}
		System.out.println(MinVal1);
		

	}

}
