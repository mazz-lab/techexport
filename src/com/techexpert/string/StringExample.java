package com.techexpert.string;



//String class represents character strings, we can instantiate String by two ways.
//String str = "abc"; or String str = new String ("abc");
//String is immutable in java, so its easy to share it across different threads or functions.
//When we create a String using double quotes, it first looks for the String with same value in the JVM string pool,
//if found it returns the reference else it creates the String object and then place it in the String pool. 
//This way JVM saves a lot of space by using same String in different threads. But if new operator is used,
//it explicitly creates a new String in the heap memory.
//+ operator is overloaded for String and used to concatenate two Strings. Although internally it uses StringBuffer to perform this action.
//String overrides equals() and hashCode() methods, two Strings are equal only if they have same characters in same order.
//Note that equals() method is case sensitive, so if you are not looking for case sensitive checks, you should use equalsIgnoreCase() method.
//A String represents a string in the UTF-16 format
//String is a final class with all the fields as final except “private int hash”. 
//This field contains the hashCode() function value and created only when hashCode() method is called and then cached in this field. Furthermore, hash is generated using final fields of String class with some calculations, so every time hashCode() method is called, it will result in same output. For caller, its like calculations are happening every time but internally it’s cached in hash field.

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
