package com.bridgelabz;

public class Constructor {
	public String name;    //constructor
	Constructor(){       //it has same name as class name we cant change the name
		System.out.println("hii");  //print krnyasathi
	    name = "program"; //initialize
	    }
	public static void main(String[] args) { //main
		Constructor obj = new Constructor();   //object
		System.out.println("the name is: " +obj.name); //name la cl krne
	}
		
	}


