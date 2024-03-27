package copypgrm;

import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println("enter the array value");
			arr[i]=sc.nextInt();
		}
		int array[]=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("the copied numbers"+(array[i]));
			array[i]=sc.nextInt();
		}
	}
}

