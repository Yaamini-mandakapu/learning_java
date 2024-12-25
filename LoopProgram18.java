package com.learningjava.loops.java;

//Write a java program to diplay table for a given integer

import java.util.Scanner;

public class LoopProgram18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		System.out.println("Enter the starting multiply number: ");
		int startingMultiplyNumber = sc.nextInt();
		System.out.println("Enter the ending multiply number");
		int endingMultiplyNumber = sc.nextInt();
		int finalAns;
		for(int i=startingMultiplyNumber; i<=endingMultiplyNumber; i++) {
			finalAns = number * i;
			System.out.println(+number+ "x" +i+ "=" +finalAns);
		}
	}

}
