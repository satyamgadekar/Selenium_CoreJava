import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Date d = new Date();
		
		System.out.println(d);
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getMonth());
		
		/*
		 * If you want to print the date in a particular format we have class called SimpleDateFormat
		 * Import that class, and just with the use of date class print that.
		 * 
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
		
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
	}

}
