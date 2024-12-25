package com.learningjava.loops.java;

import java.util.Scanner;

//write the program to display a pattern like a right angle triangle using an asterisk

public class LoopProgram20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
