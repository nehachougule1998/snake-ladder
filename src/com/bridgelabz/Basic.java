package com.bridgelabz;
import java.util.Scanner;
public class Basic { //class
	String sc = "hello"; //instace variable
	public static void main(String [] args) {
		int a = 2; // local variable
		int b = 3; //local variable
		System.out.println(a+" "+b);
		Basic obj = new Basic();  //object
		obj.message(); //cl krne
		String name = obj.sc; //sc chi value name madhe save krnyasathi
	    System.out.println(name);
	    obj.add();
	    } 
	    public void message() {
	    	System.out.println("neha"); // method
	    
	    }
	    public void add() {
	    	System.out.println("hii"); //method
	    }
	    
	  }	
