package threedarraythreed;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num of school");
		int school=sc.nextInt();
		int [][][] arr=new int[school][][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter num of cls in school"+(i+1));
			int cls=sc.nextInt();
			int brr [][]=new int[cls][];
		}
		for(int i=0; i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				
				System.out.println("enter num of students in cls"+(j+1));
				int student=sc.nextInt();
				int brr [][]=new int [student][];			}}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)

			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("enter the school"+(i+1)+"of class"+(j+1)+"of student"+(k+1)+"marks is"+(arr[i][j][k]));
					arr[i][j][k]=sc.nextInt();
				}}}
				
				for(int i=0;i<=arr.length-1;i++)
				{
					for(int j=0;j<=arr[i].length-1;j++)

					{
						for(int k=0;k<=arr[i][j].length-1;k++)
						{
							System.out.println("the school"+(i+1)+"of class"+(j+1)+"of student"+(k+1)+"marks is" +(arr[i][j][k]));
						}
					}
				}
			}}


