package com.learningjava.loops.java;

//print 1 to 100 values


import java.util.Scanner;

public class LoopProgram11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		for(int i=startingNumber; i<=endingNumber; i++) {
			System.out.println(i);
		}
		System.out.println("The Program  is succesfully completed");

	}

}
