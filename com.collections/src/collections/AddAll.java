package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddAll {

	public static void main(String[] args) {
		
        ArrayList<String> al1 = new ArrayList<String>();
		
		al1.add("laptop");
		al1.add("keyboard");
		al1.add("mouse");
		al1.add("pendrive");
		al1.add("desktop");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("keyboard");
		al2.add("mouse");
		al2.add("harddisc");
		al2.add("pendrive");
		al2.add("desktop");
		al2.add("desktop");
		
		ArrayList<String> al3 = new ArrayList<String>();
		
		al3.addAll(al1);
		al3.addAll(al2);
		
		System.out.println("al1 :"+al1);
		System.out.println("al2 :"+al2);
		System.out.println("al3 :"+al3);
		
		System.out.println("before copy al1:"+al1);
		System.out.println("before copy al2:"+al2);
		Collections.copy(al2, al1);
		System.out.println("after copy al1:"+al1);
		System.out.println("after copy al2:"+al2);
		
		System.out.println("Extract some portion from collections");
		List<String> extrct = al1.subList(0, 3);
		System.out.println("Extract :"+extrct);
		
		ArrayList<String> cloning = (ArrayList<String>) al1.clone();
		System.out.println("cloning :"+cloning);
	
	}
}
