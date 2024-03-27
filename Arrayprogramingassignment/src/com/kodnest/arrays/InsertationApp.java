package com.kodnest.arrays;

public class InsertationApp {
	public static int[] sort(int []arr)
	{
		for(int i=1;i<=arr.length-1;i++)
		{
			int j=i-1;
			
				int elem=arr[i];
				while(j>=0 && arr[j]>elem)
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=elem;
			}
			
		return arr;

	}
	}

