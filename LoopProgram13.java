package com.learningjava.loops.java;

//print the sum of the even numbers between starting number and ending number


import java.util.Scanner;

public class LoopProgram13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		int sum = 0;
		for(int i=startingNumber; i<=endingNumber; i++) {
			if(i%2 == 0) {
				sum += i;
			}
			
		}
		System.out.println(sum);

	}

}
