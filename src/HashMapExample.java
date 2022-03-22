import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * HashMap is basically used to map key to value. Not like ArrayList and HashSet where indexing works.
		 * 
		 * Ex:
		 * HashMap<Key,value> HM = new HashMap<Key,value>();
		 */
		
		HashMap<Integer,String> HM = new HashMap<Integer,String>();
		HM.put(0, "Morning");
		HM.put(1, "Afternoon");
		HM.put(2, "Evening");
		HM.put(3, "Night");
		HM.put(4, "Dawn");
		
		System.out.println(HM.get(1));
		System.out.println(HM.remove(4));
		
		//If object key is not there it will return null.
		System.out.println(HM.get(10));
		
		/*
		 * Now as of you saw that we can print only 1 element based on the index.
		 * But if we want to print all element then we have to use entryset concept with Iterator concept as used.
		 */
		
		Set sn= HM.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext())
		{
			//Now as u know in HashMap we map keys to value so we want to print key and value diffenrent.
			//So, use Map.Entry
			
			Map.Entry MP =(Map.Entry) it.next();
			System.out.print(MP.getKey());
			System.out.print("\t");
			System.out.print(MP.getValue());
			System.out.println("");
			
		}

	}

}
