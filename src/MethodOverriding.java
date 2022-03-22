/*Method overriding= when the method have same name same parameter but it has different
body then it is called
* as an method overriding,that is we can say that method have same definition but have
different body.
*
* Rules
* 1.Method have same name and parameter.'
* 2.Method body should be different.
* 3.There must be two classes for having method overriding.
* 4.Throgh inheritance we can achieve overriding.
*
* overloading 								overriding
* 1.parameter should be change 				1.parameter should be same
* 2.body is same/different 					2.Body must be different
* 3.it can achieve in inheritance also 		3.it achived only in inheritance.
*
* example,we take an example of bank where all gives different rate of interest.
*
*/

class Bank
 {
		double getrateofInterest()
			{
				return 2.5;
			}
 }

 class HDFC extends Bank
 {
	 	double getrateofInterest()
	 		{
	 			return 12.5;
	 		}
 }
 class ICICI extends Bank
 {
	 	double getrateofInterest()
	 		{
	 			return 8.5;
	 		} 
 }
 class CITYBANK extends Bank
 {
	 	double getrateofInterest()
	 		{
	 			return 5.5;
	 		}
 }
 
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1 = new Bank();
		System.out.println(b1.getrateofInterest());
		
		HDFC b2 = new HDFC();
		System.out.println(b2.getrateofInterest());
		
		ICICI b3 = new ICICI();
		System.out.println(b3.getrateofInterest());
		
		CITYBANK b4 = new CITYBANK();
		System.out.println(b4.getrateofInterest());		
	}
}
