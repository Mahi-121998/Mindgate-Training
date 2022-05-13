package com.mindgate.main;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {
		SortedSet<String> nameSortedSet= new TreeSet<String>();
		
		nameSortedSet.add("mahi");
		nameSortedSet.add("komal");
		nameSortedSet.add("vinni");
		nameSortedSet.add("Shashi");
		
		System.out.println(nameSortedSet);
	}

}
