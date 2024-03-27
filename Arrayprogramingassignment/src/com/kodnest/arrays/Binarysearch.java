package com.kodnest.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the array size");
         int size= sc.nextInt();
         int arr []=new int[size];
         System.out.println("enter"+arr.length+"of numbers");
         
         for(int i=0;i<=arr.length-1;i++)
         {
        	 arr[i]=sc.nextInt();
         }
         Arrays.sort(arr);
         System.out.println("enter the key to searched");
         int key=sc.nextInt();
         BinarysearchApp.num(arr,key);
	}

}
