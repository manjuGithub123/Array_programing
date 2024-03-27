package com.kodnest.arrays;

import java.util.Scanner;

public class Arrayforeach3 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of array");
		int length=sc.nextInt();
		int arr []=new int[length];
		System.out.println("enter the"+arr.length+"of numbers");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the number to be stored");
		
		for(int i:arr)
		{
			if(i>0)
			{
				System.out.println(i);
			}


			System.out.println();
		}
	}


}
