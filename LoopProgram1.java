package com.learningjava.loops.java;

//print 1 to 100 values


import java.util.Scanner;


public class LoopProgram1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the starting number: ");
	    int startingNumber = sc.nextInt();
	    System.out.print("Enter the ending number: ");
	    int endingNumber = sc.nextInt();
	    int i = 1;
	    while(i<=100) {
	    	System.out.println(i);
	    	i++;
	    }
	    System.out.println("The Program  is succesfully completed");

	    
	
	}

}
