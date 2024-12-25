package com.learningjava.loops.java;

//print the number odd number for the range of starting number and ending number in reverse order


import java.util.Scanner;

public class LoopProgram14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int startingNumber = sc.nextInt();
		System.out.println("Enter the ending number: ");
		int endingNumber = sc.nextInt();
		
		for(int i=startingNumber; i>=endingNumber; i--) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("The program is succefully completed");

	}

}
