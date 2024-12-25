package com.learningjava.loops.java;

//print the odd numbers between starting number and ending number in reverse order


import java.util.Scanner;

public class LoopProgram10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		int i = startingNumber;
		do {
			if(i%2 != 0) {
				System.out.println(i);
				
			}
			i--;
		} while (i>=endingNumber);
		System.out.println("The Program  is succesfully completed");

	}

}
