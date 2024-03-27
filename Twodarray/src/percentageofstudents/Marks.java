package percentageofstudents;    //regular array

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the num of school");
int school=sc.nextInt();
System.out.println("enter the num of cls");
int cls=sc.nextInt();
System.out.println("enter the num of student");
int student=sc.nextInt();
int arr[][][]=new int [school][cls][student];
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
		for(int k=0;k<=arr[i][j].length-1;k++)
		{
			System.out.println("enter the school"+(i+1)+"of class"+(j+1)+"of student"+(k+1)+"marks");
			arr[i][j][k]=sc.nextInt();
		}}}
		for(int i =0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("the school"+(i+1)+"of class"+(j+1)+"of student"+(k+1)+"marks is"+(arr[i][j][k]));
				}
			}
		}
	}

	}


