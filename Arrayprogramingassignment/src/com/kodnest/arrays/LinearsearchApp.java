package com.kodnest.arrays;



public class LinearsearchApp {
public static String num(int []arr,int key)//method to perform linear search
{
 for(int i=0;i<=arr.length-1;i++)//to check all the elements in array
 {
	 if(key==arr[i])//cond to compare key with arr[i]
	 {
		 return("key"+key+"is present at index"+i);
	 }
 }
 return("key"+key+"is not present");
}
}
