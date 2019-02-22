package com.techexpert.string;

public class StringBufferVsStringBuilderExample {
	
	
	    StringBuffer b;

	    public StringBufferVsStringBuilderExample()
	    {
	        b = new StringBuffer();
	    }

	    public String someMethod()
	    {
	        b.append("Some Method");
	        return(b.toString());
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBufferVsStringBuilderExample i=new StringBufferVsStringBuilderExample();
		System.out.println(i.someMethod());
		
		StringBuffer demo1 = new StringBuffer("Hello") ;
		// The above object stored in heap and its value can be changed .
		demo1=new StringBuffer("Bye");
		// Above statement is right as it modifies the 

		
		System.out.println("demo1.."+demo1);
		
		StringBuilder demo2= new StringBuilder("Hello");
		// The above object too is stored in the heap and its value can be modified
		demo2=new StringBuilder("Bye");
		
		System.out.println("demo2.."+demo2);
		
		
		
		
		// Above statement is right as it modifies the value which is allowed in the StringBuilder
	}
	
	

}
