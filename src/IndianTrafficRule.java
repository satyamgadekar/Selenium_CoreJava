import AnotherPackage.RailwayTrafficRule;

public class IndianTrafficRule implements CentralTrafficRule , RailwayTrafficRule {
	
	
	/*Now as we said, Interface named CentralTrafficRule will be same for all.
	 * So, all other countries will just implement those methods.
	 * 
	 * As we know the methods and variables are outside the class, amd to use that we create an object to use those methods.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndianTrafficRule TraRule = new IndianTrafficRule();
		
		TraRule.GreenGo();
		TraRule.RedStop();
		TraRule.YellowFlasing();
		TraRule.TimeWait();
		
		CentralTrafficRule TraRule1 = new IndianTrafficRule();
		
		TraRule1.GreenGo();
		TraRule1.RedStop();
		TraRule1.YellowFlasing();
		
		/*
		 * Now, as we have to create the object, with second method.
		 * 
		 * 
		 */
		
		
		
		RailwayTrafficRule RailRule = new IndianTrafficRule();
		
		RailRule.TimeWait();
		
		//Now, here we created an RailRule for RailwayTrafficRule, 
		
		//CentralTrafficRule TraRule = new IndianTrafficRule();
		
		/*
		 * By default the access specifier is public for method and variables.
		 * Now as per this, we have created an object for "IndianTrafficRule" (RHS) class, and we are implementing method from
		 * "IndianTrafficRule" (LHS) Class.
		 * But if we see actually we are implementing actually from "CentralTrafficRule" Interface.
		 * 
		 * So we will write it as:
		 * 
		 * 1: IndianTrafficRule TraRule = new IndianTrafficRule();   When we not implements Interface.
		 * 
		 * 2: CentralTrafficRule TraRule = new IndianTrafficRule();    When we implement Interface.
		 * 
		 * Now, as we can see both class and Interface are in same package, so no need to create 2: object as above.
		 */
		
		

	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		
		System.out.println("This is GoGreen Method");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		
		System.out.println("This is RedStop Method");
		
	}

	@Override
	public void YellowFlasing() {
		// TODO Auto-generated method stub
		
		System.out.println("This is YellowFlasing Method");
		
	}

	@Override
	public void TimeWait() {
		// TODO Auto-generated method stub
		
		System.out.println("For each railway timespan will be different. ");
		
	}

}
