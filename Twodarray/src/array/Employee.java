package array;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num of companies");
		int company=sc.nextInt();
		System.out.println("enter the num of emp");
		int emp=sc.nextInt();
		String [][] arr=new String[company][emp];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("enter the company"+(i+1)+"emp name is"+(j+1));
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			System.out.println("the company" +(i+1)+"emp name"+(j+1)+"is"+(arr[i][j]));	
			}
		}
	}

}
