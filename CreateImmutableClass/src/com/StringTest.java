package com;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		secondHightest();
		primeNum(15);
		armStrong();
		Integer i1=10;
		@SuppressWarnings("removal")
		Integer i2=new Integer(10);
		System.out.println(i1==i2);
	 }
	static void secondHightest() {
		int[] arr= {132,23,3,45,56};
		int max=0;
		int secmax=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];
			}
			else if(arr[i]>secmax) {
				secmax=arr[i];
			}
		}  
		System.out.println(max +" "+secmax);
	}
	static void primeNum(int n) {
		int m=0,flag=0;  
		 m=n/2;    
		if(n==0||n==1)
		   System.out.println(n+" is not prime number");    
		  else{
		   for(int i=2;i<=m;i++){    
		    if(n%i==0){    
		     System.out.println(n+" is not prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0)  { System.out.println(n+" is prime number"); }
		  }
		  }
	static void armStrong() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 3 digit number");
		int n=scn.nextInt();
		double num=scn.nextInt();
		
		int tempnum,digit,cubedigit=0;
		tempnum=n;
		while(tempnum!=0) {
			digit=tempnum%10;
			System.out.println("Digit = "+digit);
			cubedigit=cubedigit+digit*digit*digit;
			System.out.println("cubedigit = "+cubedigit);
			tempnum=tempnum/10;
			}
		if(tempnum==n)
			System.out.println("armstrong");
		else 
			System.out.println("no armstron");
	}
}
	
