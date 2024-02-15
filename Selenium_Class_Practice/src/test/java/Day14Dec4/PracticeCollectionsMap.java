package Day14Dec4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class PracticeCollectionsMap {
	public static void main(String[] args) {
		//HashMap
		System.out.println("---------HashMap---------");
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Sachin");
		hm.put(3, "Kumar");
		hm.put(2, "Sachin");
		hm.put(5, "Bisht");
		hm.put(1, "Mishra");
		hm.put(4, "Mishra");
		Set<Integer> Allkeys=hm.keySet();
		for(Integer i:Allkeys) {
			System.out.println("Key : "+i);
			System.out.println("Value : "+hm.get(i));
		}
		//LinkedHashMap
		System.out.println("---------LinkedHashMap---------");
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(1, "Sachin");
		lhm.put(3, "Kumar");
		lhm.put(2, "Sachin");
		lhm.put(5, "Bisht");
		lhm.put(1, "Mishra");
		lhm.put(4, "Mishra");
		Set<Integer> Allkeys1=lhm.keySet();
		for(Integer k:Allkeys1) {
			System.out.println("Key : "+k);
			System.out.println("Value : "+lhm.get(k));
		}
		//TreeMap
		System.out.println("---------TreeMap---------");
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		lhm.put(1, "Sachin");
		lhm.put(3, "Kumar");
		lhm.put(2, "Sachin");
		lhm.put(5, "Bisht");
		lhm.put(1, "Mishra");
		lhm.put(4, "Mishra");
		Set<Integer> Allkeys2=lhm.keySet();
		for(Integer k:Allkeys2) {
			System.out.println("Key : "+k);
			System.out.println("Value : "+lhm.get(k));
		}
	}
}
