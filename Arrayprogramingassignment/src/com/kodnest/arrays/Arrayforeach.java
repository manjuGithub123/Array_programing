package com.kodnest.arrays;

import java.util.Scanner;

public class Arrayforeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter length");
   int length=sc.nextInt();
   int arr []=new int[length];
   System.out.println("enter the"+arr.length+"number of array");
   for(int i=0;i<=arr.length-1;i++)
   {
	   arr[i]=sc.nextInt();
   }
   System.out.println("the number to be stored");
   for(int x:arr)  {
	   
	   System.out.println(x);
   }
	}

}
