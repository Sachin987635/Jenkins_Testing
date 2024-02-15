package Day14Dec4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PracticeCollectionsSets {
	private static final boolean Integer = false;

	public static void main(String[] args) {
		//Hashset
		System.out.println("---------HashSet---------");
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(1);
		hs.add(11);
		hs.add(13);
		hs.add(22);
		hs.add(10);
		hs.add(55);
		for (Integer j : hs) {
			System.out.println(j);
		}
		//LinkedHashSet
		System.out.println("---------LinkedHashSet---------");
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(1);
		lhs.add(11);
		lhs.add(13);
		lhs.add(22);
		lhs.add(10);
		lhs.add(55);
		
		for(Integer k : lhs){
			System.out.println(k);
		}
		//TreeSet
		System.out.println("---------TreeSet---------");
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(1);
		ts.add(11);
		ts.add(13);
		ts.add(22);
		ts.add(10);
		ts.add(55);
		for(Integer l : ts) {
			System.out.println(l);
		}
	}
}
