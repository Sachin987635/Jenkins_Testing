package Day14Dec4;

import java.util.ArrayList;
import java.util.LinkedList;

public class PracticeCollectionsList {
	public static void main(String[] args) {
		//ArrayList
		System.out.println("---------ArrayList---------");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(1);
		al.add(12);
		al.add(19);
		al.add(2);
		al.add(1);
		for(Integer i:al) {
			System.out.println(i);
		}
		//LinkedList
		System.out.println("---------LinkedList---------");
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(1);
		ll.add(12);
		ll.add(19);
		ll.add(2);
		ll.add(1);
		for(Integer j:ll) {
			System.out.println(j);
		}
	}
}
