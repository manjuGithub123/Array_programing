package backlogs;

import java.util.Scanner;

public class Backlog 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num of sem");

		int sem=sc.nextInt();
		boolean []arr=new boolean[sem];
		for(int i=0;i<=arr.length-1;i++)
		{
	
			System.out.println("do u have any backlogs in sem"+(i+1)+" is:");
				arr[i]=sc.nextBoolean();
			if(arr[i]==true)
			{
				System.out.println("yes");
				//arr[i]="YES";
			}
			else
			{
				//arr[i]="NO";
				System.out.println("no");
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("backlog in sem "+(i+1)+"is:"+arr[i]);
		}
	}
}
