package com;
public class StringReverse {
	public static void main(String[] args) {
		   
		 String originalString="Hii My Name Is Neha";
		 String reverseString="";
		 String[] words=originalString.split(" ");
		 for(int i=0;i<words.length;i++) {
		 	String word=words[i];
		 	String reverseWord="";
		 	for(int j = word.length()-1; j>=0; j--) {
		 		reverseWord=reverseWord+word.charAt(j);
		 		}
		 	reverseString=reverseString+reverseWord+" ";
		 }
		 	System.out.println(reverseString);
		 	StringReverse rs= new StringReverse();
		 	Package p = rs.getClass().getPackage();
		 	System.out.println(p);
		  }
		}





































