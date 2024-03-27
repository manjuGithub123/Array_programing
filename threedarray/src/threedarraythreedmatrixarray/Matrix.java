package threedarraythreedmatrixarray;

import java.util.Scanner;

public class Matrix {

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
 System.out.println("the elements are");
 
 for(int i=0;i<=arr.length-1;i++)
 {
	 for(int j=0;j<=arr[i].length-1;j++)
	 {
		 System.out.print((arr[i][j]+" "));
	 }
	 System.out.println();
 }
	}
	

}
