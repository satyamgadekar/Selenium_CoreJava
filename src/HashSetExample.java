import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Set is similar to like List, but it does not accept duplicate values.
		 * There is no gurantee that elements are stored in sequential manner,Stored in random order.
		 * HashSet,LinkesHashSet,TreeSet are types of Set
		 */

		HashSet<String> HS = new HashSet<String>();
		
		HS.add("INDIA");
		HS.add("USA");
		HS.add("UK");
		
		//Now if you see we have added UK again, but it will not add it as it does not accept duplicate.
		HS.add("UK");
		
		System.out.println(HS);
		
		System.out.println(HS.size());
		System.out.println(HS.contains("UK"));
		System.out.println(HS.isEmpty());
		
		/*Iterator
		 * 
		 * Most of the times interviewer will ask the question like, how will you itrate thogh set?
		 * Then we can say that we will add Iterator with Set object. And create another object for the same.
		 * Iterator object dot next will be used to tranverse throgh each element.
		 * One next will be used to traverse throgh one element.
		 */
		
		 Iterator<String> ite = HS.iterator();
		 System.out.println(ite.next());
		 
		 //Suppose now consider there are 100's of elements and we want to print each element
		 //then use while loop with hasnext method.
		 
		 System.out.println("This will separate the thing.");
		 
		 while(ite.hasNext())
		 {
			 System.out.println(ite.next());
			 
		 }
	}

}
