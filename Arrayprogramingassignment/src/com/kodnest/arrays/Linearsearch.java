package com.kodnest.arrays;

import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);//creating scanner object 
 System.out.println("enter the size of array");//asking user to enter size
 int size=sc.nextInt();//reading and storing value in variable size
 int arr []=new int[size];//creating array
 System.out.println("enter"+arr.length+"number to be stored");
 for(int i=0;i<=arr.length-1;i++)
 {
	 arr[i]=sc.nextInt();
 }
 System.out.println("enter key to be searched");//asking user to enter ey
 int key=sc.nextInt();//reading and stored key 
 System.out.println(LinearsearchApp.num(arr,key));
	}

}
