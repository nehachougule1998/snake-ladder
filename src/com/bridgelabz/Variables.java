package com.bridgelabz;

public class Variables {
	char a = '4'; // instance variable
    static float b = 0.1f; //static variable
	public static void main(String[] args) {
	    int c = 3; //local variable
		Variables var = new Variables();
		System.out.println(var.a+" "+b+" "+c);
	}

}
