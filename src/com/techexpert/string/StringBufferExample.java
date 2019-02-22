package com.techexpert.string;

//Note: Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously.
//So it is safe and will result in an order.

public class StringBufferExample {

	public static void main(String[] args) {
		
		
		StringBuffer sb=new StringBuffer("Praveen");
        System.out.println("string is :" +sb);
        sb.append("kumar");
        System.out.println("After append:" +sb);
        String str=new String("SDJ");
        System.out.println("Given string:" +str);
        str.concat("JAVA");
        System.out.println("After Concat:" +str);

	}

}
