package com.techexpert.set;
import java.util.HashSet;

// it does not allow Duplicate

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a HashSet 
        HashSet<String> hset = new HashSet<String>(); 
  
        // add elements to HashSet 
        hset.add("geeks"); 
        hset.add("for"); 
        hset.add("practice"); 
        hset.add("contribute"); 
  
        // Duplicate removed 
        hset.add("geeks"); 
  
        // Displaying HashSet elements 
        System.out.println("HashSet contains: "); 
        for (String temp : hset) { 
            System.out.println(temp); 
        } 

	}

}
