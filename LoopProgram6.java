package com.learningjava.loops.java;

//print the sum of the even numbers between starting number and ending number

import java.util.Scanner;

public class LoopProgram6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		int i = startingNumber;
		int sum = 0;
		while(i<=endingNumber) {
			if(i%2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		System.out.println("The Program  is succesfully completed");


	}

}
