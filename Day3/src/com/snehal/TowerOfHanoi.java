package com.snehal;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void arrange(int n, char first, char med, char end) {
		if (n == 1) {
			System.out.println("Move disk 1 from " + first + " to " + end);
			return;
		}
		arrange(n - 1, first, end, med);
		System.out.println("Move disk " + n + " from " + first + " to " + end);
		arrange(n - 1, med, first, end);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of discs: ");
		int n = sc.nextInt();
		char firstRod = 'a';
		char medRod = 'b';
		char endRod = 'c';
		arrange(n, firstRod, medRod, endRod);
	}   
}
