package com.kodnest.arrays;

import java.util.Scanner;

public class Swapping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first num");
		int n1=sc.nextInt();
		System.out.println("enter the second num");
		int n2=sc.nextInt();
		System.out.println("enter before swapping");
		System.out.println(n1+" "+n2);

		int temp;

		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("after swapping");
		System.out.println(n1+" "+n2);

	}

}
