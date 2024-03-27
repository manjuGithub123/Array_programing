package com.kodnest.arrays;

public class SelectionApp {
public static int[] sort(int[]arr)
{
for(int i=0;i<=arr.length-2;i++)//starting at index 0 from until length-1
{
	int min=arr[i],pos=i;
	for(int j=i+1;j<=arr.length-1;j++)//checking elements after i
	{
	if(arr[j]<min)//comparing arr[j] with min
		
		{
		min=arr[j];//assigning arr[j] tomin
		pos=j;//assigning j to pos
		
		
	}
	}
	int temp=arr[pos];//swaping the element at i and pos
	arr[pos]=arr[i];
	arr[i]=temp;
}
	return arr;//returning sorted arr

}
}
