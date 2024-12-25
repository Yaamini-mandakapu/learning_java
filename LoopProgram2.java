package com.learningjava.loops.java;

//print even numbers between given StartingNumber and EndingNumber

import java.util.Scanner;

public class LoopProgram2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the starting number: ");
	    int startingNumber = sc.nextInt();
	    System.out.print("Enter the ending number: ");
	    int endingNumber = sc.nextInt();
	    int i = startingNumber;
	    while(i<=endingNumber) {
	    	if(i%2 == 0) {
	    		System.out.print(+i+ ", ");
	    	}
	    	i++;
	    }
	    System.out.println("The Program  is succesfully completed");

	 }
}
