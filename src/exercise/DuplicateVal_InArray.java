package exercise;

public class DuplicateVal_InArray {

	//This program to find duplicate value in Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num[] = {100,25,250,25,75,50,100,75,25,99,3,2,3};
		
		for(int i=0; i<Num.length;i++)
		{
			for(int j = i+1; j<Num.length; j++)
			{
				if(Num[i] == Num[j])
				{
					System.out.println(Num[j]);
				}
			}
		}

	}

}
