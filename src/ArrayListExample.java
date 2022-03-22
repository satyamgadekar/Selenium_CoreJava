import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ArrayList has dynamic size, not like Array where we have restrictions.
		 * With object dot we will get number of methods under it.
		 * It can accept duplicate values.
		 * ArrayList, LinkedList, Vector -- Implement List Interface.
		 * We can access variable at any indix and isert and remove also.
		 */
		
		//we can kept it like this without defining the type what we are passing, but its always better practice
		//to define datatype.
		ArrayList a = new ArrayList();
		
		LinkedList c = new LinkedList();
		
		Vector d = new Vector();
		
		
		//Here if you can see we have specified data types.
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		b.add(1000);
		b.add(2000);
		b.add(3000);
		b.add(4000);
		b.add(5000);
		
		//we can easily add at any index point of arraylist.
		//we can remove the one variable by index number or directly passing variable also.
		//We can remove all variable also by saying romove all.
		//get will be used to get any vaiable at any index.
		//If we want to know, wheter any variabla is present or not use "contains".
		
		b.add(0, 999);
		System.out.println(b);
		
		/*
		b.remove(0);
		b.removeAll(b);
		*/
		System.out.println(b.get(1));
		
		System.out.println(b.contains(3000));
		
		

	}

}
