package com.learningjava.loops.java;

//print even numbers between given StartingNumber and EndingNumber


import java.util.Scanner;

public class LoopProgram12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		for(int i=startingNumber; i<=endingNumber; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			
		}
		
	}
}