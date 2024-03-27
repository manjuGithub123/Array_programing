package patient;

import java.util.Scanner;

public class Hospitalage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
int arr[][]=new int [3][];
arr[0]=new int[2];
arr[1]=new int[4];
arr[2]=new int[3];
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
		System.out.println("enter the age for hospital"+(i+1)+"of patient "+(j+1));
		arr[i][j]=sc.nextInt();
	}}
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("the age for hospital"+(i+1)+"of patient"+(j+1)+(arr[i][j]));
		}
}

}

	}


