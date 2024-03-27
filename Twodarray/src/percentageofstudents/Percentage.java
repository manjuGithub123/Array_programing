package percentageofstudents;

import java.util.Scanner;

public class Percentage {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enternum of class");
int cls=sc.nextInt();
float arr[][]=new float[4][];
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("enter the num of students"+(i+1));
	int student=sc.nextInt();
	arr[i]=new float[student];
	
}
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
	System.out.println("enter the percentage of student"+(i+1)+"of class"+(j+1)+"is"+(arr[i][j]));
	arr[i][j]=sc.nextFloat();
	}}
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("the percentage of student"+(i+1)+"of class"+(j+1)+"is"+(arr[i][j]));
		}
	}
}

	}


