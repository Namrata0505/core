package com;

public class FinalVsImmutable {
public static void main(String[] args) {
	final StringBuilder db= new StringBuilder("Hello ");
	
	System.out.println(db.append("My name is neha"));
	System.out.println(db);
	//db=new StringBuilder("Dave");
	
	
	String s="hello";
	
	System.out.println(s+" My name is namrata");
	System.out.println(s);
	s="hii";
	System.out.println(s);
}
}
