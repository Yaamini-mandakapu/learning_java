package com.learningjava.loops.java;

//print the odd numbers between starting number and ending number in reverse order


import java.util.Scanner;

public class LoopProgram5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		int i = startingNumber;
		while(i>=endingNumber) {
			if(i%2 != 0) {
				System.out.print(+i+", ");
			}
			i--;
		}
		System.out.println("The Program  is succesfully completed");


	}

}
