package com.learningjava.loops.java;
//print 1 to 100 values

import java.util.Scanner;

public class LoopProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		int i = startingNumber;
		do {
			
			System.out.println(i);
			i++;
		}while (i<=endingNumber);
		System.out.println("The Program  is succesfully completed");

		
	}

}
