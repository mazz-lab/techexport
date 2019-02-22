package com.techexpert.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemoVsLinkedListExample {
	
	public static void RetrieveLinkedList() {
		
		ArrayList<Double> stockArray=new ArrayList<Double>();
		stockArray.add(45.00);
		stockArray.add(51.00);
		stockArray.add(62.50);
		stockArray.add(42.75);
		stockArray.add(36.80);
		stockArray.add(68.40);
		
		Double firstArray = stockArray.get(0);
        System.out.println("Initial Stock Price : " + firstArray);
		
		 // A LinkedList containing Stock Prices of a company for the last 6 days
        LinkedList<Double> stockPrices = new LinkedList<>();

        stockPrices.add(45.00);
        stockPrices.add(51.00);
        stockPrices.add(62.50);
        stockPrices.add(42.75);
        stockPrices.add(36.80);
        stockPrices.add(68.40);

        // Getting the first element in the LinkedList using getFirst()
        // The getFirst() method throws NoSuchElementException if the LinkedList is empty
        Double firstElement = stockPrices.getFirst();
        System.out.println("Initial Stock Price : " + firstElement);

        // Getting the last element in the LinkedList using getLast()
        // The getLast() method throws NoSuchElementException if the LinkedList is empty
        Double lastElement = stockPrices.getLast();
        System.out.println("Current Stock Price : " + lastElement);

        // Getting the element at a given position in the LinkedList
        Double stockPriceOn3rdDay = stockPrices.get(0);
        System.out.println("Stock Price on 3rd Day : " + stockPriceOn3rdDay);
	}

	public static void main(String[] args) {
		
		RetrieveLinkedList();
		// TODO Auto-generated method stub
//		  // Creating a LinkedList
        LinkedList<String> friends = new LinkedList<>();

        // Adding new elements to the end of the LinkedList using add() method.
        friends.add(0,"Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");

        System.out.println("Initial LinkedList : " + friends);
//
//        // Adding an element at the specified position in the LinkedList
//        friends.add(3, "Lisa");
//        System.out.println("After add(3, \"Lisa\") : " + friends);
//
//        // Adding an element at the beginning of the LinkedList
//        friends.addFirst("Steve");
//        System.out.println("After addFirst(\"Steve\") : " + friends);
//
//        // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
//        friends.addLast("Jennifer");
//        System.out.println("After addLast(\"Jennifer\") : " + friends);
//
//        // Adding all the elements from an existing collection to the end of the LinkedList
//        ArrayList<String> familyFriends = new ArrayList<>();
//        familyFriends.add("Jesse");
//        familyFriends.add("Walt");
//
//        friends.addAll(familyFriends);
//        System.out.println("After addAll(familyFriends) : " + friends);
		
		

	}

}
