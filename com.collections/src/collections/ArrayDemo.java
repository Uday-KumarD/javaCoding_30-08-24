package collections;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//LinkedList al = new LinkedList();
		// Vector al = new Vector();
		// Stack al = new Stack();
		// internally they are different
		
		System.out.println(al.size());
//		System.out.println(al.Capacity());
		al.add(56); // primitive is converted into object
		al.add(new Integer(45));
		al.add("uday");
		al.add("goat");
		al.add("kumar");
		al.add(56);
		al.add(25.20);
		al.add(null);
		al.add(true);
		al.add("kumar");
		System.out.println(al.size());
		
		System.out.println(al);
		
	}
}
