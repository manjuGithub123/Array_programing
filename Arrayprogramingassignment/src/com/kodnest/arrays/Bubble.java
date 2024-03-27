
package com.kodnest.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {

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
       System.out.println("the numbers before sorting");
       for(int x:arr)
       {
    	   System.out.println(x+" ");
       }
       System.out.println();
       int []SortedArr=BubbleApp.sort(arr);
       System.out.println("the numers after sorting");
       for(int x:SortedArr)
       {
    	   System.out.println(x+" ");
       }
       
       
	}

}
