package linearsearch;

import java.util.Scanner;

public class LinearApp {
public static void num(int size)
{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[size];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("enter the num that to be present");
		arr[i]=sc.nextInt();
	}
	int num=sc.nextInt();
	for(int i=0;i<=arr.length-1;i++)
	{
		if(num==arr[i])
		{
		System.out.println("the number present at"+(i+1));	
		}
		else
		{
			System.out.println("the number not present at"+(i+1));
		}
	}
}
}
