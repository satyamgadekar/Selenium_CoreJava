package exercise;
public class Prime_Number {

	//Prime number is that number which is divisible by 1 or itself only.
	//0 and 1 are not Prime numbers.
	//Prime number is always greater than 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6; //Number to be checked
		int m = 0;
		int flag = 0;
		
		m=n/2;
		if(n==0 || n==1)
		{
			System.out.println(n + " is not a prime number.");
		}
		else
		{
			for(int i=2; i<=m; i++)
			{
				if(n%i==0)
				{
					System.out.println(n + " is not a prime number.");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(n + " is a prime number.");
			}
		}
	}
}
