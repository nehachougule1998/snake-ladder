package com.bridgelabz;
import java.util.Random;
public class Snake_ladder {
    int startposition = 0; 
    static Random ch = new Random();
    static int getrandomvalue (){
    int randomvalue = ch.nextInt(6) +1;
    return randomvalue;  
    }
     public static void main(String[] args) {
	 System.out.println("welcome to snake and ladder game");
	 int randomvalue = getrandomvalue();
	 System.out.println(randomvalue);

	}

}