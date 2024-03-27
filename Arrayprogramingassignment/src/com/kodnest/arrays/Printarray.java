package com.kodnest.arrays;

import java.util.Scanner;

public class Printarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the length");
          int length=sc.nextInt();
          int arr []=new int[length];
          System.out.println("the numbers "+arr.length+"to be stored");
          for(int i=0;i<=arr.length-1;i++)
          {
        	  arr[i]=sc.nextInt();
          }
          System.out.println("the number to be stored in array");
          for(int i=0;i<=arr.length-1;i++)
        	  
          {
        	  System.out.println((arr[i]+" "));
          }
	}

}
