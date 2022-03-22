public class ChildVehicle extends ParentVehicle

{
	public void color()
	{
		System.out.println("The color of the car is:" + color);
	}
	
	public void Engine()
	{
		System.out.println("The configuratio of Engine");
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		ChildVehicle TaTaNano = new ChildVehicle();
		
		TaTaNano.color = "Yellow";
		System.out.println(TaTaNano.color);
		TaTaNano.AudioSystem();
		TaTaNano.Brakes();
		TaTaNano.Engine();
		TaTaNano.Gear();
		TaTaNano.color();		

	}

}

