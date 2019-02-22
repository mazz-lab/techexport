package com.techexpert.set;

import java.util.TreeSet;


// doest not all duplicate and ordered
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Create a TreeSet 
        TreeSet<String> tset = new TreeSet<String>(); 
  
        // add elements to HashSet 
        tset.add("geeks"); 
        tset.add("for"); 
        tset.add("practice"); 
        tset.add("contribute"); 
  
        // Duplicate removed 
        tset.add("geeks"); 
  
        // Displaying TreeSet elements 
        System.out.println("TreeSet contains: "); 
        for (String temp : tset) { 
            System.out.println(temp); 
        } 
		
	}

}
