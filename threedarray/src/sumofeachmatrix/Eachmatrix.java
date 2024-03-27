package sumofeachmatrix;

import java.util.Scanner;

public class Eachmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the num of rows");
		 int rows=sc.nextInt();
		 System.out.println("enter the num of col");
		 int col=sc.nextInt();
		 int arr[][]=new int [rows][col];
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 for(int j=0;j<=arr[i].length-1;j++)
			 {
				 arr[i][j]=sc.nextInt();
				 
			 }
			 
		 }
		 int sum=0;
		
		 
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 sum=0;
			 for(int j=0;j<=arr[i].length-1;j++)
			 {
				 sum=sum+arr[i][j];
				 System.out.print(sum+" ");
			 }
			 System.out.println(" ");
			 
		 }
		 //System.out.println("the sum of all elements is"+sum);
			}
			

		

	

	}


