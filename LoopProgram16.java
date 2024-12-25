package com.learningjava.loops.java;

//write a program in java to read number from keyboard and find the sum

import java.util.Scanner;

public class LoopProgram16 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  numbers: ");
		int number = sc.nextInt();
		int otherNumber = sc.nextInt();
		
		while(number <= otherNumber || number >= otherNumber || 
			  number == otherNumber || otherNumber >= number || 
			  otherNumber <= number) {
			
			number += otherNumber;
			System.out.println(number);
			otherNumber = sc.nextInt();
		}
		
		

	}

}
