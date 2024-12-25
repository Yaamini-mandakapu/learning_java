package com.learningjava.loops.java;

import java.util.Scanner;

public class LoopProgram15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		int sum = 0;
		for(int i=startingNumber; i<=endingNumber; i++) {
			sum += i;
		}
		System.out.println("The sum of natural numbers: " +sum);

	}

}
