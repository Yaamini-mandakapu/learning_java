package com.learningjava.loops.java;

//write a java program to display the cube of the number up to an integer

import java.util.Scanner;

public class LoopProgram17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		int cubeOfNumber = 1;
		for(int i=startingNumber; i<=endingNumber; i++) {
			 cubeOfNumber = (i*i*i);
			 System.out.println(cubeOfNumber);
		}
		
	}

}
