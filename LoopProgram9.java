package com.learningjava.loops.java;

//print the number which are divisible by 7 for the range of starting number and ending number

import java.util.Scanner;

public class LoopProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		int i = startingNumber;
		do {
			if(i%7 == 0) {
			   System.out.println(i);
			}
			i++;
			
		}
		while (i<=endingNumber);
		System.out.println("The Program  is succesfully completed");


	}

}
