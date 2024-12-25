package com.learningjava.loops.java;

import java.util.Scanner;

//write a java program to display the multiplier table vertically from 1 to n

public class LoopProgram19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		int multiplier = 1;
		int finalAns;
		for(int i=startingNumber; i<=endingNumber; i++) {
			for(int j=multiplier; j<=10; j++) {
				finalAns = i*j;
				System.out.println(+i+ "x" +j+ " = " +finalAns);
			}
			System.out.println("------------------------");
		}

	}

}
